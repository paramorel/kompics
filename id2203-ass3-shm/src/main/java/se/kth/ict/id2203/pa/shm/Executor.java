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
package se.kth.ict.id2203.pa.shm;

import se.sics.kompics.launch.Scenario;
import se.sics.kompics.launch.Topology;

@SuppressWarnings("serial")
public final class Executor {
	public static final void main(String[] args) {
		Topology topology = new Topology() {
			{
				node(1, "127.0.0.1", 22031);
				node(2, "127.0.0.1", 22032);
				node(3, "127.0.0.1", 22033);

				defaultLinks(1000, 0);
			}
		};

		Scenario scenario = new Scenario(Main.class) {
			{
				command(1, "S10");
				command(2, "S10");
				command(3, "S10");
			}
		};

		// Non-overlapping (sequential) operations.
//		Scenario scenario = new Scenario(Main.class) {
//			{
//				command(1, "S10");
//				command(2, "S500:W4");
//				command(3, "S10000:R");
//			}
//		};

		// Concurrent operations.
//		Scenario scenario = new Scenario(Main.class) {
//			{
//				command(1, "W1:R:S1000:W12:R");
//				command(2, "W2:R:S3000:R");
//				command(3, "S5500:W3:R:S3000:R");
//			}
//		};

		// One process crashes and the other processes keep running.
//		Scenario scenario = new Scenario(Main.class) {
//			{
//				command(1, "X");
//				command(2, "W2");
//				command(3, "S5000:R");
//			}
//		};

		scenario.executeOn(topology);

		System.exit(0);
	}
}
