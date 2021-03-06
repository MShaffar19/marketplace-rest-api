/* Copyright (c) 2019 Eclipse Foundation and others.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License 2.0
 * which is available at http://www.eclipse.org/legal/epl-v20.html,
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipsefoundation.marketplace.namespace;

import org.eclipsefoundation.marketplace.dto.Catalog;
import org.eclipsefoundation.marketplace.dto.Category;
import org.eclipsefoundation.marketplace.dto.ErrorReport;
import org.eclipsefoundation.marketplace.dto.Install;
import org.eclipsefoundation.marketplace.dto.InstallMetrics;
import org.eclipsefoundation.marketplace.dto.Listing;
import org.eclipsefoundation.marketplace.dto.ListingVersion;
import org.eclipsefoundation.marketplace.dto.Market;
import org.eclipsefoundation.marketplace.dto.MetricPeriod;
import org.eclipsefoundation.marketplace.dto.Promotion;

/**
 * Mapping of DTO classes to their respective tables in the DB.
 * 
 * @author Martin Lowe
 *
 */
public enum DtoTableNames {
	LISTING(Listing.class, "listings"), CATEGORY(Category.class, "categories"), CATALOG(Catalog.class, "catalogs"),
	MARKET(Market.class, "markets"), ERRORREPORT(ErrorReport.class, "errorreports"), INSTALL(Install.class, "installs"),
	INSTALL_METRIC(InstallMetrics.class, "install_metrics"), METRIC_PERIOD(MetricPeriod.class, "installs"),
	LISTING_VERSION(ListingVersion.class, "listing_versions"),PROMOTION(Promotion.class, "promotion");

	private Class<?> baseClass;
	private String tableName;

	private DtoTableNames(Class<?> baseClass, String tableName) {
		this.baseClass = baseClass;
		this.tableName = tableName;
	}

	public static String getTableName(Class<?> targetBase) {
		for (DtoTableNames dtoPair : values()) {
			if (dtoPair.baseClass == targetBase) {
				return dtoPair.tableName;
			}
		}
		return null;
	}

	public String getTableName() {
		return this.tableName;
	}
}
