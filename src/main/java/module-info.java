/*
 * semanticcms-dia-all - Convenience POM to include most SemanticCMS Dia features, not including documentation or examples.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-dia-all.
 *
 * semanticcms-dia-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-dia-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-dia-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.dia.all {
	// Direct
	requires transitive com.semanticcms.dia.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-model</artifactId>
	requires transitive com.semanticcms.dia.servlet; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-servlet</artifactId>
	requires transitive com.semanticcms.dia.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-taglib</artifactId>
}
