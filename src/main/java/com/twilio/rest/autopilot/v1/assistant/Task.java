/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task extends Resource {
    private static final long serialVersionUID = 120802226226536L;

    /**
     * Create a TaskFetcher to execute fetch.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathSid A 34-character string that uniquely identifies this resource.
     * @return TaskFetcher capable of executing the fetch
     */
    public static TaskFetcher fetcher(final String pathAssistantSid, 
                                      final String pathSid) {
        return new TaskFetcher(pathAssistantSid, pathSid);
    }

    /**
     * Create a TaskReader to execute read.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @return TaskReader capable of executing the read
     */
    public static TaskReader reader(final String pathAssistantSid) {
        return new TaskReader(pathAssistantSid);
    }

    /**
     * Create a TaskCreator to execute create.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param uniqueName A user-provided string that uniquely identifies this
     *                   resource as an alternative to the sid. Unique up to 64
     *                   characters long.
     * @return TaskCreator capable of executing the create
     */
    public static TaskCreator creator(final String pathAssistantSid, 
                                      final String uniqueName) {
        return new TaskCreator(pathAssistantSid, uniqueName);
    }

    /**
     * Create a TaskUpdater to execute update.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathSid A 34-character string that uniquely identifies this resource.
     * @return TaskUpdater capable of executing the update
     */
    public static TaskUpdater updater(final String pathAssistantSid, 
                                      final String pathSid) {
        return new TaskUpdater(pathAssistantSid, pathSid);
    }

    /**
     * Create a TaskDeleter to execute delete.
     * 
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathSid A 34-character string that uniquely identifies this resource.
     * @return TaskDeleter capable of executing the delete
     */
    public static TaskDeleter deleter(final String pathAssistantSid, 
                                      final String pathSid) {
        return new TaskDeleter(pathAssistantSid, pathSid);
    }

    /**
     * Converts a JSON String into a Task object using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Task object represented by the provided JSON
     */
    public static Task fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Task.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Task object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Task object represented by the provided JSON
     */
    public static Task fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Task.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final Map<String, String> links;
    private final String assistantSid;
    private final String sid;
    private final String uniqueName;
    private final URI actionsUrl;
    private final URI url;

    @JsonCreator
    private Task(@JsonProperty("account_sid")
                 final String accountSid, 
                 @JsonProperty("date_created")
                 final String dateCreated, 
                 @JsonProperty("date_updated")
                 final String dateUpdated, 
                 @JsonProperty("friendly_name")
                 final String friendlyName, 
                 @JsonProperty("links")
                 final Map<String, String> links, 
                 @JsonProperty("assistant_sid")
                 final String assistantSid, 
                 @JsonProperty("sid")
                 final String sid, 
                 @JsonProperty("unique_name")
                 final String uniqueName, 
                 @JsonProperty("actions_url")
                 final URI actionsUrl, 
                 @JsonProperty("url")
                 final URI url) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.links = links;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.actionsUrl = actionsUrl;
        this.url = url;
    }

    /**
     * Returns The The unique ID of the Account that created this Task..
     * 
     * @return The unique ID of the Account that created this Task.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The date that this resource was created.
     * 
     * @return The date that this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date that this resource was last updated.
     * 
     * @return The date that this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The A user-provided string that identifies this resource. It is
     * non-unique and can be up to 255 characters long..
     * 
     * @return A user-provided string that identifies this resource. It is
     *         non-unique and can be up to 255 characters long.
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The The unique ID of the Assistant..
     * 
     * @return The unique ID of the Assistant.
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns The A 34-character string that uniquely identifies this resource..
     * 
     * @return A 34-character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The A user-provided string that uniquely identifies this resource as
     * an alternative to the sid. Unique up to 64 characters long..
     * 
     * @return A user-provided string that uniquely identifies this resource as an
     *         alternative to the sid. Unique up to 64 characters long.
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The A user-provided HTTP endpoint where the assistant can fetch
     * actions..
     * 
     * @return A user-provided HTTP endpoint where the assistant can fetch actions.
     */
    public final URI getActionsUrl() {
        return this.actionsUrl;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Task other = (Task) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(links, other.links) && 
               Objects.equals(assistantSid, other.assistantSid) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(uniqueName, other.uniqueName) && 
               Objects.equals(actionsUrl, other.actionsUrl) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            links,
                            assistantSid,
                            sid,
                            uniqueName,
                            actionsUrl,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("links", links)
                          .add("assistantSid", assistantSid)
                          .add("sid", sid)
                          .add("uniqueName", uniqueName)
                          .add("actionsUrl", actionsUrl)
                          .add("url", url)
                          .toString();
    }
}