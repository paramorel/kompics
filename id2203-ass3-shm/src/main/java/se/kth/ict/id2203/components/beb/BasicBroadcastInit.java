/**
 * This file is part of the ID2203 course assignments kit.
 * 
 * Copyright (C) 2009-2013 KTH Royal Institute of Technology
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package se.kth.ict.id2203.components.beb;

import java.util.Set;

import se.sics.kompics.Init;
import se.sics.kompics.address.Address;

public class BasicBroadcastInit extends Init<BasicBroadcast> {

	private final Address selfAddress;
	private final Set<Address> allAddresses;
	
	public BasicBroadcastInit(Address selfAddress, Set<Address> allAddresses) {
		this.selfAddress = selfAddress;
		this.allAddresses = allAddresses;
	}

	public Address getSelfAddress() {
		return selfAddress;
	}
	
	public Set<Address> getAllAddresses() {
		return allAddresses;
	}
}
