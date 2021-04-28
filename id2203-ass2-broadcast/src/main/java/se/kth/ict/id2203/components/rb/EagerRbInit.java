package se.kth.ict.id2203.components.rb;

import java.util.Set;

import se.sics.kompics.Init;
import se.sics.kompics.address.Address;

public class EagerRbInit extends Init<EagerRb> {

	private final Address selfAddress;
	private final Set<Address> allAddresses;

	public EagerRbInit(Address selfAddress, Set<Address> allAddresses) {
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
