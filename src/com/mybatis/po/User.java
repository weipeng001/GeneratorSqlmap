package com.mybatis.po;

public class User {
    private String id;

    private String fdsgdsg;

    private String fsdf;

    private String fdg;

    private String asd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFdsgdsg() {
        return fdsgdsg;
    }

    public void setFdsgdsg(String fdsgdsg) {
        this.fdsgdsg = fdsgdsg == null ? null : fdsgdsg.trim();
    }

    public String getFsdf() {
        return fsdf;
    }

    public void setFsdf(String fsdf) {
        this.fsdf = fsdf == null ? null : fsdf.trim();
    }

    public String getFdg() {
        return fdg;
    }

    public void setFdg(String fdg) {
        this.fdg = fdg == null ? null : fdg.trim();
    }

    public String getAsd() {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd == null ? null : asd.trim();
    }
}