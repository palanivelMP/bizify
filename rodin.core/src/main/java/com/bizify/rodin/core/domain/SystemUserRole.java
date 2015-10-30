package com.bizify.rodin.core.domain;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

public class SystemUserRole extends BaseDomain implements Persistence {

    private static final long serialVersionUID = -1176647502233105858L;

    private SystemUser systemUser;
    private SystemRole systemRole;

    public SystemUserRole() {}

    public SystemUserRole(SystemUser systemUser, SystemRole systemRole) {
        this.systemUser = systemUser;
        this.systemRole = systemRole;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }

    public SystemRole getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(SystemRole systemRole) {
        this.systemRole = systemRole;
    }

}
