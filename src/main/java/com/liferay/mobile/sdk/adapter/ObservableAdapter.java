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

package com.liferay.mobile.sdk.adapter;

import com.liferay.mobile.sdk.Call;

import java.lang.reflect.Type;

import rx.Observable;
import rx.Subscriber;

/**
 * @author Bruno Farache
 */
public class ObservableAdapter implements ReturnTypeAdapter<Observable> {

	@Override
	public Observable adapt(Call call) {
		return Observable.create(new OnCallSubscribe<>(call));
	}

	@Override
	public Type type() {
		return Observable.class;
	}

	class OnCallSubscribe<T> implements Observable.OnSubscribe<T> {

		OnCallSubscribe(Call<T> call) {
			this.call = call;
		}

		@Override
		public void call(Subscriber<? super T> subscriber) {
			try {
				if (!subscriber.isUnsubscribed()) {
					subscriber.onNext(call.execute());
				}
			}
			catch (Exception e) {
				if (!subscriber.isUnsubscribed()) {
					subscriber.onError(e);
				}
			}

			if (!subscriber.isUnsubscribed()) {
				subscriber.onCompleted();
			}
		}

		protected Call<T> call;
	}

}