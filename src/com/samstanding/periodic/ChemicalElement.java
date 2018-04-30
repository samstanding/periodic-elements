package com.samstanding.periodic;

public class ChemicalElement {
	
	private String name;
	private String atomicNumber;
	private String symbol;
	private String metalGroup;
		
	public ChemicalElement() {
		this.name = "Bad Query";
		this.atomicNumber = "-1";
		this.symbol = "--";
		this.metalGroup = "BadQuery";
	}
	
	public ChemicalElement(String atomicNumber, String name, String symbol, String metalGroup) {
		this.name = name;
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.metalGroup = metalGroup;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getAtomicNumber() {
		return atomicNumber;
	}
	
	public void setAtomicNumber(String atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	
	public String getMetalGroup() {
		return metalGroup;
	}
	
	public void setMetalGroup(String metalGroup) {
		this.metalGroup = metalGroup;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Element Atomic Number: %s%n", this.getAtomicNumber()));
		sb.append(String.format("Element Name: %s%n", this.getName()));
		sb.append(String.format("Element Symbol: %s%n", this.getSymbol()));
		sb.append(String.format("Element Metal Group: %s%n", this.getMetalGroup()));
		return sb.toString();
	}
}
