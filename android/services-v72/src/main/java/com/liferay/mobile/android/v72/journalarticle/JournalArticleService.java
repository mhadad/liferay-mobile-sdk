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

package com.liferay.mobile.android.v72.journalarticle;

import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JournalArticleService extends BaseService {

	public JournalArticleService(Session session) {
		super(session);
	}

	public JSONObject addArticle(long groupId, long folderId, JSONObject titleMap, JSONObject descriptionMap, String content, String ddmStructureKey, String ddmTemplateKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("titleMap", checkNull(titleMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/add-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addArticle(long groupId, long folderId, long classNameId, long classPK, String articleId, boolean autoArticleId, JSONObject titleMap, JSONObject descriptionMap, JSONObject friendlyURLMap, String content, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObject images, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("autoArticleId", autoArticleId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("folderId", folderId);
			_params.put("friendlyURLMap", checkNull(friendlyURLMap));
			_params.put("groupId", groupId);
			_params.put("images", checkNull(images));
			_params.put("indexable", indexable);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("neverExpire", neverExpire);
			_params.put("neverReview", neverReview);
			_params.put("reviewDateDay", reviewDateDay);
			_params.put("reviewDateHour", reviewDateHour);
			_params.put("reviewDateMinute", reviewDateMinute);
			_params.put("reviewDateMonth", reviewDateMonth);
			_params.put("reviewDateYear", reviewDateYear);
			_params.put("smallFile", checkNull(smallFile));
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("titleMap", checkNull(titleMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/add-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addArticle(long groupId, long folderId, long classNameId, long classPK, String articleId, boolean autoArticleId, JSONObject titleMap, JSONObject descriptionMap, String content, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObject images, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("autoArticleId", autoArticleId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("images", checkNull(images));
			_params.put("indexable", indexable);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("neverExpire", neverExpire);
			_params.put("neverReview", neverReview);
			_params.put("reviewDateDay", reviewDateDay);
			_params.put("reviewDateHour", reviewDateHour);
			_params.put("reviewDateMinute", reviewDateMinute);
			_params.put("reviewDateMonth", reviewDateMonth);
			_params.put("reviewDateYear", reviewDateYear);
			_params.put("smallFile", checkNull(smallFile));
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("titleMap", checkNull(titleMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/add-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addArticle(long groupId, long folderId, long classNameId, long classPK, String articleId, boolean autoArticleId, JSONObject titleMap, JSONObject descriptionMap, String content, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("autoArticleId", autoArticleId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("indexable", indexable);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("neverExpire", neverExpire);
			_params.put("neverReview", neverReview);
			_params.put("reviewDateDay", reviewDateDay);
			_params.put("reviewDateHour", reviewDateHour);
			_params.put("reviewDateMinute", reviewDateMinute);
			_params.put("reviewDateMonth", reviewDateMonth);
			_params.put("reviewDateYear", reviewDateYear);
			_params.put("titleMap", checkNull(titleMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/add-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject copyArticle(long groupId, String oldArticleId, String newArticleId, boolean autoArticleId, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("autoArticleId", autoArticleId);
			_params.put("groupId", groupId);
			_params.put("newArticleId", checkNull(newArticleId));
			_params.put("oldArticleId", checkNull(oldArticleId));
			_params.put("version", version);

			_command.put("/journal.journalarticle/copy-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteArticle(long groupId, String articleId, double version, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("groupId", groupId);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/delete-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteArticle(long groupId, String articleId, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("groupId", groupId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/delete-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject expireArticle(long groupId, String articleId, double version, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("groupId", groupId);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/expire-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void expireArticle(long groupId, String articleId, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("groupId", groupId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/expire-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchArticle(long groupId, String articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/fetch-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getArticle(long id) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("id", id);

			_command.put("/journal.journalarticle/get-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getArticle(long groupId, String articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getArticle(long groupId, String articleId, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("version", version);

			_command.put("/journal.journalarticle/get-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getArticle(long groupId, String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getArticleByUrlTitle(long groupId, String urlTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("urlTitle", checkNull(urlTitle));

			_command.put("/journal.journalarticle/get-article-by-url-title", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public String getArticleContent(long groupId, String articleId, double version, String languageId, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("version", version);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/journal.journalarticle/get-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getArticleContent(long groupId, String articleId, double version, String languageId, JSONObjectWrapper portletRequestModel, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("version", version);
			mangleWrapper(_params, "portletRequestModel", "com.liferay.portal.kernel.portlet.PortletRequestModel", portletRequestModel);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/journal.journalarticle/get-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getArticleContent(long groupId, String articleId, String languageId, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/journal.journalarticle/get-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getArticleContent(long groupId, String articleId, String languageId, JSONObjectWrapper portletRequestModel, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			mangleWrapper(_params, "portletRequestModel", "com.liferay.portal.kernel.portlet.PortletRequestModel", portletRequestModel);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/journal.journalarticle/get-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getArticles(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticles(long groupId, long folderId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticles(long groupId, long folderId, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("locale", checkNull(locale));

			_command.put("/journal.journalarticle/get-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticles(long groupId, long folderId, String locale, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("locale", checkNull(locale));
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByArticleId(long groupId, String articleId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-article-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByLayoutUuid(long groupId, String layoutUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutUuid", checkNull(layoutUuid));

			_command.put("/journal.journalarticle/get-articles-by-layout-uuid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByStructureId(long groupId, long classNameId, String ddmStructureKey, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByStructureId(long groupId, long classNameId, String ddmStructureKey, String locale, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("locale", checkNull(locale));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByStructureId(long groupId, String ddmStructureKey, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByStructureId(long groupId, String ddmStructureKey, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getArticlesByStructureId(long groupId, String ddmStructureKey, String locale, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("locale", checkNull(locale));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-articles-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getArticlesCount(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getArticlesCount(long groupId, long folderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/journal.journalarticle/get-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getArticlesCountByArticleId(long groupId, String articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-articles-count-by-article-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getArticlesCountByStructureId(long groupId, long classNameId, String ddmStructureKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/journal.journalarticle/get-articles-count-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getArticlesCountByStructureId(long groupId, String ddmStructureKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-articles-count-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getArticlesCountByStructureId(long groupId, String ddmStructureKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/journal.journalarticle/get-articles-count-by-structure-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONObject getDisplayArticleByUrlTitle(long groupId, String urlTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("urlTitle", checkNull(urlTitle));

			_command.put("/journal.journalarticle/get-display-article-by-url-title", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public Integer getFoldersAndArticlesCount(long groupId, JSONArray folderIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-folders-and-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONArray getGroupArticles(long groupId, long userId, long rootFolderId, int status, boolean includeOwner, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeOwner", includeOwner);
			_params.put("rootFolderId", rootFolderId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", orderByComparator);

			_command.put("/journal.journalarticle/get-group-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupArticles(long groupId, long userId, long rootFolderId, int status, boolean includeOwner, String locale, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeOwner", includeOwner);
			_params.put("locale", checkNull(locale));
			_params.put("rootFolderId", rootFolderId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", orderByComparator);

			_command.put("/journal.journalarticle/get-group-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupArticles(long groupId, long userId, long rootFolderId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", orderByComparator);

			_command.put("/journal.journalarticle/get-group-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupArticles(long groupId, long userId, long rootFolderId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("start", start);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", orderByComparator);

			_command.put("/journal.journalarticle/get-group-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getGroupArticlesCount(long groupId, long userId, long rootFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("userId", userId);

			_command.put("/journal.journalarticle/get-group-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getGroupArticlesCount(long groupId, long userId, long rootFolderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/journal.journalarticle/get-group-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getGroupArticlesCount(long groupId, long userId, long rootFolderId, int status, boolean includeOwner) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("includeOwner", includeOwner);
			_params.put("rootFolderId", rootFolderId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/journal.journalarticle/get-group-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONObject getLatestArticle(long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/journal.journalarticle/get-latest-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getLatestArticle(long groupId, String articleId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/journal.journalarticle/get-latest-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getLatestArticle(long groupId, String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-latest-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getLatestArticles(long groupId, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/get-latest-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getLatestArticlesCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/journal.journalarticle/get-latest-articles-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONArray getLayoutArticles(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/get-layout-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public void moveArticle(long groupId, String articleId, long newFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("newFolderId", newFolderId);

			_command.put("/journal.journalarticle/move-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void moveArticle(long groupId, String articleId, long newFolderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("newFolderId", newFolderId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/move-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject moveArticleFromTrash(long groupId, long resourcePrimKey, long newFolderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("newFolderId", newFolderId);
			_params.put("resourcePrimKey", resourcePrimKey);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/move-article-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject moveArticleFromTrash(long groupId, String articleId, long newFolderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("newFolderId", newFolderId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/move-article-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject moveArticleToTrash(long groupId, String articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/move-article-to-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void removeArticleLocale(long companyId, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("languageId", checkNull(languageId));

			_command.put("/journal.journalarticle/remove-article-locale", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject removeArticleLocale(long groupId, String articleId, double version, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("version", version);

			_command.put("/journal.journalarticle/remove-article-locale", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void restoreArticleFromTrash(long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/journal.journalarticle/restore-article-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void restoreArticleFromTrash(long groupId, String articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/restore-article-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject search(long groupId, long creatorUserId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("creatorUserId", creatorUserId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/journal.journalarticle/search", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray search(long companyId, long groupId, JSONArray folderIds, long classNameId, String keywords, double version, String ddmStructureKey, String ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("end", end);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("reviewDate", reviewDate);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("version", version);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/search", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray search(long companyId, long groupId, JSONArray folderIds, long classNameId, String articleId, double version, String title, String description, String content, JSONArray ddmStructureKeys, JSONArray ddmTemplateKeys, long displayDateGT, long displayDateLT, int status, long reviewDate, boolean andOperator, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("articleId", checkNull(articleId));
			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKeys", checkNull(ddmStructureKeys));
			_params.put("ddmTemplateKeys", checkNull(ddmTemplateKeys));
			_params.put("description", checkNull(description));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("end", end);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("reviewDate", reviewDate);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("title", checkNull(title));
			_params.put("version", version);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/search", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray search(long companyId, long groupId, JSONArray folderIds, long classNameId, String articleId, double version, String title, String description, String content, String ddmStructureKey, String ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, boolean andOperator, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("articleId", checkNull(articleId));
			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("description", checkNull(description));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("end", end);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("reviewDate", reviewDate);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("title", checkNull(title));
			_params.put("version", version);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.journal.model.JournalArticle>", obc);

			_command.put("/journal.journalarticle/search", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer searchCount(long companyId, long groupId, JSONArray folderIds, long classNameId, String keywords, double version, String ddmStructureKey, String ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("reviewDate", reviewDate);
			_params.put("status", status);
			_params.put("version", version);

			_command.put("/journal.journalarticle/search-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer searchCount(long companyId, long groupId, JSONArray folderIds, long classNameId, String articleId, double version, String title, String description, String content, JSONArray ddmStructureKeys, JSONArray ddmTemplateKeys, long displayDateGT, long displayDateLT, int status, long reviewDate, boolean andOperator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("articleId", checkNull(articleId));
			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKeys", checkNull(ddmStructureKeys));
			_params.put("ddmTemplateKeys", checkNull(ddmTemplateKeys));
			_params.put("description", checkNull(description));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("reviewDate", reviewDate);
			_params.put("status", status);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/journal.journalarticle/search-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer searchCount(long companyId, long groupId, JSONArray folderIds, long classNameId, String articleId, double version, String title, String description, String content, String ddmStructureKey, String ddmTemplateKey, long displayDateGT, long displayDateLT, int status, long reviewDate, boolean andOperator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("articleId", checkNull(articleId));
			_params.put("classNameId", classNameId);
			_params.put("companyId", companyId);
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("description", checkNull(description));
			_params.put("displayDateGT", displayDateGT);
			_params.put("displayDateLT", displayDateLT);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("reviewDate", reviewDate);
			_params.put("status", status);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/journal.journalarticle/search-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public void subscribe(long groupId, long articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", articleId);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/subscribe", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void subscribeStructure(long groupId, long userId, long ddmStructureId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureId", ddmStructureId);
			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/journal.journalarticle/subscribe-structure", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribe(long groupId, long articleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", articleId);
			_params.put("groupId", groupId);

			_command.put("/journal.journalarticle/unsubscribe", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribeStructure(long groupId, long userId, long ddmStructureId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureId", ddmStructureId);
			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/journal.journalarticle/unsubscribe-structure", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateArticle(long userId, long groupId, long folderId, String articleId, double version, JSONObject titleMap, JSONObject descriptionMap, String content, String layoutUuid, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("content", checkNull(content));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("titleMap", checkNull(titleMap));
			_params.put("userId", userId);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateArticle(long groupId, long folderId, String articleId, double version, JSONObject titleMap, JSONObject descriptionMap, JSONObject friendlyURLMap, String content, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObject images, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("folderId", folderId);
			_params.put("friendlyURLMap", checkNull(friendlyURLMap));
			_params.put("groupId", groupId);
			_params.put("images", checkNull(images));
			_params.put("indexable", indexable);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("neverExpire", neverExpire);
			_params.put("neverReview", neverReview);
			_params.put("reviewDateDay", reviewDateDay);
			_params.put("reviewDateHour", reviewDateHour);
			_params.put("reviewDateMinute", reviewDateMinute);
			_params.put("reviewDateMonth", reviewDateMonth);
			_params.put("reviewDateYear", reviewDateYear);
			_params.put("smallFile", checkNull(smallFile));
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("titleMap", checkNull(titleMap));
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateArticle(long groupId, long folderId, String articleId, double version, JSONObject titleMap, JSONObject descriptionMap, String content, String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour, int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObject images, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("content", checkNull(content));
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("ddmTemplateKey", checkNull(ddmTemplateKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("images", checkNull(images));
			_params.put("indexable", indexable);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("neverExpire", neverExpire);
			_params.put("neverReview", neverReview);
			_params.put("reviewDateDay", reviewDateDay);
			_params.put("reviewDateHour", reviewDateHour);
			_params.put("reviewDateMinute", reviewDateMinute);
			_params.put("reviewDateMonth", reviewDateMonth);
			_params.put("reviewDateYear", reviewDateYear);
			_params.put("smallFile", checkNull(smallFile));
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("titleMap", checkNull(titleMap));
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateArticle(long groupId, long folderId, String articleId, double version, String content, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("content", checkNull(content));
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateArticleTranslation(long groupId, String articleId, double version, String locale, String title, String description, String content, JSONObject images, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("content", checkNull(content));
			_params.put("description", checkNull(description));
			_params.put("groupId", groupId);
			_params.put("images", checkNull(images));
			_params.put("locale", checkNull(locale));
			_params.put("title", checkNull(title));
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-article-translation", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateContent(long groupId, String articleId, double version, String content) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("content", checkNull(content));
			_params.put("groupId", groupId);
			_params.put("version", version);

			_command.put("/journal.journalarticle/update-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateStatus(long groupId, String articleId, double version, int status, String articleURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("articleURL", checkNull(articleURL));
			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/journal.journalarticle/update-status", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}