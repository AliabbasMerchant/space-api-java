package com.spaceuptech.space_api.utils;

public class Or extends Condition {
    public Condition conds[];

    public Or(Condition conds[]) {
        this.condType = CondType.OR;
        this.conds = conds;
    }

    public static Or create(Condition ...conds) {
        return new Or(conds);
    }
}
