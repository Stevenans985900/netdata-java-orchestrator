/*
 * Copyright (C) 2017 Simon Nagl
 *
 * netadata-plugin-java-daemon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.firehol.netdata.plugin.jmx;

import java.util.LinkedList;
import java.util.List;

import javax.management.ObjectName;

import org.firehol.netdata.entity.Dimension;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MBeanQueryInfo {
	private ObjectName name;
	private String attribute;
	private Class<?> type;
	private List<Dimension> dimensions = new LinkedList<>();
}