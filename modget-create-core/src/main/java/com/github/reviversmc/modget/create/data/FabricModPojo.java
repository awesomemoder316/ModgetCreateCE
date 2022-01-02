package com.github.reviversmc.modget.create.data;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class FabricModPojo {

    private String[] authors;
    private String name;
    private String description;
    private String id;
    private String version;

    private Contact contact;

    /*
    This is a huge dumping group for all values, as there can be so many dynamic values.
    Should never actually be used to get values!
     */
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final Map<String, Object> json = new HashMap<>();

    public FabricModPojo() {

    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @JsonAnySetter
    public void addJson(String key, Object value) {
        json.put(key, value);
    }

    public static class Contact {

        private String homepage = "~";
        private String sources = "~";
        private String issues = "~";

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public String getSources() {
            return sources;
        }

        public void setSources(String sources) {
            this.sources = sources;
        }

        public String getIssues() {
            return issues;
        }

        public void setIssues(String issues) {
            this.issues = issues;
        }
    }
}
