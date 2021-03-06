/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1.service.function;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class FunctionVersion extends Resource {
    private static final long serialVersionUID = 44094398576696L;

    public enum Visibility {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECTED("protected");

        private final String value;

        private Visibility(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Visibility from a string.
         * @param value string value
         * @return generated Visibility
         */
        @JsonCreator
        public static Visibility forValue(final String value) {
            return Promoter.enumFromString(value, Visibility.values());
        }
    }

    /**
     * Create a FunctionVersionReader to execute read.
     * 
     * @param pathServiceSid The service_sid
     * @param pathFunctionSid The function_sid
     * @return FunctionVersionReader capable of executing the read
     */
    public static FunctionVersionReader reader(final String pathServiceSid, 
                                               final String pathFunctionSid) {
        return new FunctionVersionReader(pathServiceSid, pathFunctionSid);
    }

    /**
     * Create a FunctionVersionFetcher to execute fetch.
     * 
     * @param pathServiceSid The service_sid
     * @param pathFunctionSid The function_sid
     * @param pathSid The sid
     * @return FunctionVersionFetcher capable of executing the fetch
     */
    public static FunctionVersionFetcher fetcher(final String pathServiceSid, 
                                                 final String pathFunctionSid, 
                                                 final String pathSid) {
        return new FunctionVersionFetcher(pathServiceSid, pathFunctionSid, pathSid);
    }

    /**
     * Create a FunctionVersionCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param pathFunctionSid The function_sid
     * @param path The path
     * @param visibility The visibility
     * @return FunctionVersionCreator capable of executing the create
     */
    public static FunctionVersionCreator creator(final String pathServiceSid, 
                                                 final String pathFunctionSid, 
                                                 final String path, 
                                                 final FunctionVersion.Visibility visibility) {
        return new FunctionVersionCreator(pathServiceSid, pathFunctionSid, path, visibility);
    }

    /**
     * Converts a JSON String into a FunctionVersion object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return FunctionVersion object represented by the provided JSON
     */
    public static FunctionVersion fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FunctionVersion.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a FunctionVersion object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return FunctionVersion object represented by the provided JSON
     */
    public static FunctionVersion fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FunctionVersion.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String functionSid;
    private final String path;
    private final Map<String, Object> preSignedUploadUrl;
    private final FunctionVersion.Visibility visibility;
    private final DateTime dateCreated;
    private final URI url;

    @JsonCreator
    private FunctionVersion(@JsonProperty("sid")
                            final String sid, 
                            @JsonProperty("account_sid")
                            final String accountSid, 
                            @JsonProperty("service_sid")
                            final String serviceSid, 
                            @JsonProperty("function_sid")
                            final String functionSid, 
                            @JsonProperty("path")
                            final String path, 
                            @JsonProperty("pre_signed_upload_url")
                            final Map<String, Object> preSignedUploadUrl, 
                            @JsonProperty("visibility")
                            final FunctionVersion.Visibility visibility, 
                            @JsonProperty("date_created")
                            final String dateCreated, 
                            @JsonProperty("url")
                            final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.functionSid = functionSid;
        this.path = path;
        this.preSignedUploadUrl = preSignedUploadUrl;
        this.visibility = visibility;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.url = url;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The service_sid.
     * 
     * @return The service_sid
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The The function_sid.
     * 
     * @return The function_sid
     */
    public final String getFunctionSid() {
        return this.functionSid;
    }

    /**
     * Returns The The path.
     * 
     * @return The path
     */
    public final String getPath() {
        return this.path;
    }

    /**
     * Returns The The pre_signed_upload_url.
     * 
     * @return The pre_signed_upload_url
     */
    public final Map<String, Object> getPreSignedUploadUrl() {
        return this.preSignedUploadUrl;
    }

    /**
     * Returns The The visibility.
     * 
     * @return The visibility
     */
    public final FunctionVersion.Visibility getVisibility() {
        return this.visibility;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
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

        FunctionVersion other = (FunctionVersion) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(functionSid, other.functionSid) && 
               Objects.equals(path, other.path) && 
               Objects.equals(preSignedUploadUrl, other.preSignedUploadUrl) && 
               Objects.equals(visibility, other.visibility) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            functionSid,
                            path,
                            preSignedUploadUrl,
                            visibility,
                            dateCreated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("functionSid", functionSid)
                          .add("path", path)
                          .add("preSignedUploadUrl", preSignedUploadUrl)
                          .add("visibility", visibility)
                          .add("dateCreated", dateCreated)
                          .add("url", url)
                          .toString();
    }
}