package com.bizify.rodin.core.domain;

import com.bizify.rodin.core.BaseDomain;
import com.bizify.rodin.core.Persistence;

public class SystemRoleModule extends BaseDomain implements Persistence {

    private static final long serialVersionUID = 8160141364314641205L;

    private SystemRole systemRole;
    private SystemModule systemModule;

    public SystemRoleModule() {}

    public SystemRoleModule(SystemRole systemRole, SystemModule systemModule) {
        this.systemRole = systemRole;
        this.systemModule = systemModule;
    }

    public SystemRole getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(SystemRole systemRole) {
        this.systemRole = systemRole;
    }

    public SystemModule getSystemModule() {
        return systemModule;
    }

    public void setSystemModule(SystemModule systemModule) {
        this.systemModule = systemModule;
    }

}
