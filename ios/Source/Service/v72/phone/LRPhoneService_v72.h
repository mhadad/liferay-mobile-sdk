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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRPhoneService_v72 : LRBaseService

- (NSDictionary *)getPhoneWithPhoneId:(long long)phoneId error:(NSError **)error;
- (NSDictionary *)addPhoneWithClassName:(NSString *)className classPK:(long long)classPK number:(NSString *)number extension:(NSString *)extension typeId:(long long)typeId primary:(BOOL)primary serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updatePhoneWithPhoneId:(long long)phoneId number:(NSString *)number extension:(NSString *)extension typeId:(long long)typeId primary:(BOOL)primary error:(NSError **)error;
- (NSArray *)getPhonesWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (void)deletePhoneWithPhoneId:(long long)phoneId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end