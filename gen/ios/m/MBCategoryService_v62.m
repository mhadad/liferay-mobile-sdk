/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import "MBCategoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MBCategoryService_v62

- (NSNumber *)getSubscribedCategoriesCount:(NSNumber *)groupId userId:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId
	};

	NSDictionary *_command = @{@"/mbcategory/get-subscribed-categories-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)moveCategoryToTrash:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/move-category-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId mergeWithParentCategory:(BOOL)mergeWithParentCategory {
	NSDictionary *_params = @{
		@"categoryId": categoryId,
		@"parentCategoryId": parentCategoryId,
		@"mergeWithParentCategory": mergeWithParentCategory
	};

	NSDictionary *_command = @{@"/mbcategory/move-category": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addCategory:(NSNumber *)userId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": userId,
		@"parentCategoryId": parentCategoryId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbcategory/add-category": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveCategoryFromTrash:(NSNumber *)categoryId newCategoryId:(NSNumber *)newCategoryId {
	NSDictionary *_params = @{
		@"categoryId": categoryId,
		@"newCategoryId": newCategoryId
	};

	NSDictionary *_command = @{@"/mbcategory/move-category-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getCategories:(NSNumber *)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentCategoryIds": parentCategoryIds,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbcategory/get-categories": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/delete-category": _params};

	[session invoke:_command];
}

- (void)restoreCategoryFromTrash:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/restore-category-from-trash": _params};

	[session invoke:_command];
}

- (NSNumber *)getCategoriesCount:(NSNumber *)groupId parentCategoryIds:(NSArray *)parentCategoryIds status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentCategoryIds": parentCategoryIds,
		@"status": status
	};

	NSDictionary *_command = @{@"/mbcategory/get-categories-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getSubcategoryIds:(NSArray *)categoryIds groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"categoryIds": categoryIds,
		@"groupId": groupId,
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/get-subcategory-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getCategoryIds:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/get-category-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description displayStyle:(NSString *)displayStyle emailAddress:(NSString *)emailAddress inProtocol:(NSString *)inProtocol inServerName:(NSString *)inServerName inServerPort:(NSNumber *)inServerPort inUseSSL:(BOOL)inUseSSL inUserName:(NSString *)inUserName inPassword:(NSString *)inPassword inReadInterval:(NSNumber *)inReadInterval outEmailAddress:(NSString *)outEmailAddress outCustom:(BOOL)outCustom outServerName:(NSString *)outServerName outServerPort:(NSNumber *)outServerPort outUseSSL:(BOOL)outUseSSL outUserName:(NSString *)outUserName outPassword:(NSString *)outPassword mailingListActive:(BOOL)mailingListActive allowAnonymousEmail:(BOOL)allowAnonymousEmail mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"categoryId": categoryId,
		@"parentCategoryId": parentCategoryId,
		@"name": name,
		@"description": description,
		@"displayStyle": displayStyle,
		@"emailAddress": emailAddress,
		@"inProtocol": inProtocol,
		@"inServerName": inServerName,
		@"inServerPort": inServerPort,
		@"inUseSSL": inUseSSL,
		@"inUserName": inUserName,
		@"inPassword": inPassword,
		@"inReadInterval": inReadInterval,
		@"outEmailAddress": outEmailAddress,
		@"outCustom": outCustom,
		@"outServerName": outServerName,
		@"outServerPort": outServerPort,
		@"outUseSSL": outUseSSL,
		@"outUserName": outUserName,
		@"outPassword": outPassword,
		@"mailingListActive": mailingListActive,
		@"allowAnonymousEmail": allowAnonymousEmail,
		@"mergeWithParentCategory": mergeWithParentCategory,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbcategory/update-category": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getSubscribedCategories:(NSNumber *)groupId userId:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbcategory/get-subscribed-categories": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)unsubscribeCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/unsubscribe-category": _params};

	[session invoke:_command];
}

- (void)subscribeCategory:(NSNumber *)groupId categoryId:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/subscribe-category": _params};

	[session invoke:_command];
}

- (NSDictionary *)getCategory:(NSNumber *)categoryId {
	NSDictionary *_params = @{
		@"categoryId": categoryId
	};

	NSDictionary *_command = @{@"/mbcategory/get-category": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end