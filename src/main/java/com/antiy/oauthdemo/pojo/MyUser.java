package com.antiy.oauthdemo.pojo;

/**
 * Author: Liuchong
 * Description:
 * date: 2019/8/23 16:42
 */
public class MyUser {
    private static final long serialVersionUID = 3497935890426858541L;

    private String userName;
    private String password;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked= true;
    private boolean credentialsNonExpired= true;
    private boolean enabled= true;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"accountNonExpired\":")
                .append(accountNonExpired);
        sb.append(",\"accountNonLocked\":")
                .append(accountNonLocked);
        sb.append(",\"credentialsNonExpired\":")
                .append(credentialsNonExpired);
        sb.append(",\"enabled\":")
                .append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
