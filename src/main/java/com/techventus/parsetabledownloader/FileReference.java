package com.techventus.parsetabledownloader;

/**
 * Created by josephmalone on 2017-01-21.
 */
public class FileReference {
    String __type;
    String name;
    String url;

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FileReference{" +
                "__type='" + __type + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
