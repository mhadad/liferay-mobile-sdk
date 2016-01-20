/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mobile.android.v2;

import com.liferay.mobile.android.BaseTest;

import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class GroupServiceTest extends BaseTest {

	public GroupServiceTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		GroupService service = new GroupService(session);
		Call<JSONArray> call = service.getUserSites();
		assertUserSites(call.execute(session));
	}

	@Test
	public void getUserSitesAsync() throws InterruptedException {
		GroupService service = new GroupService(session);
		Call<JSONArray> call = service.getUserSites();

		final CountDownLatch lock = new CountDownLatch(1);

		call.async(session, new Callback<JSONArray>() {

			@Override
			public void onSuccess(JSONArray sites) {
				assertUserSites(sites);
				lock.countDown();
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		lock.await(500, TimeUnit.MILLISECONDS);
	}

	protected void assertUserSites(JSONArray sites) {
		assertNotNull(sites);
		assertTrue(sites.length() > 0);

		JSONObject jsonObj = sites.optJSONObject(0);
		assertNotNull(jsonObj);
		assertEquals("/test", jsonObj.optString("friendlyURL"));

		jsonObj = sites.optJSONObject(1);
		assertNotNull(jsonObj);
		assertEquals("/global", jsonObj.optString("friendlyURL"));

		jsonObj = sites.optJSONObject(2);
		assertNotNull(jsonObj);
		assertEquals("/guest", jsonObj.optString("friendlyURL"));
	}

}