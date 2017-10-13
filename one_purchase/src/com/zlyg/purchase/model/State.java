package com.zlyg.purchase.model;

public class State {
	private boolean checked;
	private boolean disabled;
	private boolean expanded;
	private boolean selected;

	public State() {
		this.checked = false;
		this.disabled = false;
		this.expanded = true;
		this.selected = false;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
