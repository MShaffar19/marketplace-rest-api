/*
 * Copyright (C) 2019 Eclipse Foundation and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
*/
package org.eclipsefoundation.marketplace.namespace;

/**
 * Contains names of MongoDB fields for use when working with MongoDB documents.
 * 
 * @author Martin Lowe
 *
 */
public final class DatabaseFieldNames {

	// base fields
	public static final String DOCID = "_id";
	public static final String URL = "url";
	public static final String NAME = "name";
	
	// listing fields
	public static final String LISTING_TEASER = "teaser";
	public static final String LISTING_BODY = "body";
	public static final String LISTING_AUTHORS = "authors";
	public static final String LISTING_STATUS = "status";
	public static final String LISTING_ORGANIZATIONS = "organization";
	public static final String RECENT_NSTALLS = "installs_recent";
	public static final String TOTAL_NSTALLS = "installs_total";
	public static final String MARKETPLACE_FAVORITES = "favorite_count";
	public static final String LICENSE_TYPE = "license_type";
	public static final String PLATFORMS = "platforms";
	public static final String INSTALLABLE_UNITS = "installable_units";
	public static final String CREATION_DATE = "created";
	public static final String UPDATE_DATE = "changed";
	public static final String FOUNDATION_MEMBER_FLAG = "member_company";
	public static final String HOME_PAGE_URL = "homepage_url";
	public static final String SUPPORT_PAGE_URL = "support_url";
	public static final String LISTING_VERSIONS = "versions";
	public static final String LISTING_TAGS = "tags";
	public static final String CATEGORY_IDS = "category_ids";
	public static final String LISTING_CATEGORIES = "categories";
	public static final String MAINTAINERS = "maintainers";

	// catalog fields
	public static final String CATALOG_TABS = "tabs";
	public static final String CATALOG_SELF_CONTAINED = "self_contained";
	public static final String CATALOG_SEARCH_ENABLED = "search_enabled";
	public static final String CATALOG_ICON = "icon";
	public static final String CATALOG_DESCRIPTION = "description";
	public static final String CATALOG_DEPENDENCIES_REPOSITORY = "dependencies_repository";
	
	private DatabaseFieldNames() {
	}
}
