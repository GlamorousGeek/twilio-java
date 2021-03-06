/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trunking.v1.trunk;

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

@JsonIgnoreProperties(ignoreUnknown = true)
public class TerminatingSipDomain extends Resource {
    private static final long serialVersionUID = 241276336890927L;

    /**
     * Create a TerminatingSipDomainFetcher to execute fetch.
     * 
     * @param pathTrunkSid The unique sid of the trunk.
     * @param pathSid The unique sid of the domain.
     * @return TerminatingSipDomainFetcher capable of executing the fetch
     */
    public static TerminatingSipDomainFetcher fetcher(final String pathTrunkSid, 
                                                      final String pathSid) {
        return new TerminatingSipDomainFetcher(pathTrunkSid, pathSid);
    }

    /**
     * Create a TerminatingSipDomainDeleter to execute delete.
     * 
     * @param pathTrunkSid The unique sid of the trunk.
     * @param pathSid The unique sid of the domain.
     * @return TerminatingSipDomainDeleter capable of executing the delete
     */
    public static TerminatingSipDomainDeleter deleter(final String pathTrunkSid, 
                                                      final String pathSid) {
        return new TerminatingSipDomainDeleter(pathTrunkSid, pathSid);
    }

    /**
     * Create a TerminatingSipDomainCreator to execute create.
     * 
     * @param pathTrunkSid The unique sid of the trunk.
     * @param sipDomainSid The SID of the SIP Domain to associate.
     * @return TerminatingSipDomainCreator capable of executing the create
     */
    public static TerminatingSipDomainCreator creator(final String pathTrunkSid, 
                                                      final String sipDomainSid) {
        return new TerminatingSipDomainCreator(pathTrunkSid, sipDomainSid);
    }

    /**
     * Create a TerminatingSipDomainReader to execute read.
     * 
     * @param pathTrunkSid The unique sid of the trunk.
     * @return TerminatingSipDomainReader capable of executing the read
     */
    public static TerminatingSipDomainReader reader(final String pathTrunkSid) {
        return new TerminatingSipDomainReader(pathTrunkSid);
    }

    /**
     * Converts a JSON String into a TerminatingSipDomain object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return TerminatingSipDomain object represented by the provided JSON
     */
    public static TerminatingSipDomain fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TerminatingSipDomain.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a TerminatingSipDomain object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return TerminatingSipDomain object represented by the provided JSON
     */
    public static TerminatingSipDomain fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TerminatingSipDomain.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String apiVersion;
    private final String authType;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String domainName;
    private final String friendlyName;
    private final String sid;
    private final URI url;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final HttpMethod voiceStatusCallbackMethod;
    private final URI voiceStatusCallbackUrl;
    private final URI voiceUrl;
    private final Boolean sipRegistration;
    private final String trunkSid;
    private final Map<String, String> links;

    @JsonCreator
    private TerminatingSipDomain(@JsonProperty("account_sid")
                                 final String accountSid, 
                                 @JsonProperty("api_version")
                                 final String apiVersion, 
                                 @JsonProperty("auth_type")
                                 final String authType, 
                                 @JsonProperty("date_created")
                                 final String dateCreated, 
                                 @JsonProperty("date_updated")
                                 final String dateUpdated, 
                                 @JsonProperty("domain_name")
                                 final String domainName, 
                                 @JsonProperty("friendly_name")
                                 final String friendlyName, 
                                 @JsonProperty("sid")
                                 final String sid, 
                                 @JsonProperty("url")
                                 final URI url, 
                                 @JsonProperty("voice_fallback_method")
                                 final HttpMethod voiceFallbackMethod, 
                                 @JsonProperty("voice_fallback_url")
                                 final URI voiceFallbackUrl, 
                                 @JsonProperty("voice_method")
                                 final HttpMethod voiceMethod, 
                                 @JsonProperty("voice_status_callback_method")
                                 final HttpMethod voiceStatusCallbackMethod, 
                                 @JsonProperty("voice_status_callback_url")
                                 final URI voiceStatusCallbackUrl, 
                                 @JsonProperty("voice_url")
                                 final URI voiceUrl, 
                                 @JsonProperty("sip_registration")
                                 final Boolean sipRegistration, 
                                 @JsonProperty("trunk_sid")
                                 final String trunkSid, 
                                 @JsonProperty("links")
                                 final Map<String, String> links) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.authType = authType;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.domainName = domainName;
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.url = url;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceStatusCallbackMethod = voiceStatusCallbackMethod;
        this.voiceStatusCallbackUrl = voiceStatusCallbackUrl;
        this.voiceUrl = voiceUrl;
        this.sipRegistration = sipRegistration;
        this.trunkSid = trunkSid;
        this.links = links;
    }

    /**
     * Returns The The unique id of the account responsible for this domain.
     * 
     * @return The unique id of the account responsible for this domain
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The Twilio API version used to process the call.
     * 
     * @return The Twilio API version used to process the call
     */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Returns The The types of authentication mapped to the domain.
     * 
     * @return The types of authentication mapped to the domain
     */
    public final String getAuthType() {
        return this.authType;
    }

    /**
     * Returns The The date this resource was created.
     * 
     * @return The date this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this resource was last updated.
     * 
     * @return The date this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The unique address on Twilio to route SIP traffic.
     * 
     * @return The unique address on Twilio to route SIP traffic
     */
    public final String getDomainName() {
        return this.domainName;
    }

    /**
     * Returns The A user-specified, human-readable name for the domain..
     * 
     * @return A user-specified, human-readable name for the domain.
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The A string that uniquely identifies the SIP Domain.
     * 
     * @return A string that uniquely identifies the SIP Domain
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The HTTP method used with voice_fallback_url.
     * 
     * @return HTTP method used with voice_fallback_url
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The URL Twilio will request if an error occurs in executing TwiML.
     * 
     * @return URL Twilio will request if an error occurs in executing TwiML
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The HTTP method to use with voice_url.
     * 
     * @return HTTP method to use with voice_url
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The The HTTP method Twilio will use to make requests to the
     * StatusCallback URL..
     * 
     * @return The HTTP method Twilio will use to make requests to the
     *         StatusCallback URL.
     */
    public final HttpMethod getVoiceStatusCallbackMethod() {
        return this.voiceStatusCallbackMethod;
    }

    /**
     * Returns The URL that Twilio will request with status updates.
     * 
     * @return URL that Twilio will request with status updates
     */
    public final URI getVoiceStatusCallbackUrl() {
        return this.voiceStatusCallbackUrl;
    }

    /**
     * Returns The URL Twilio will request when receiving a call.
     * 
     * @return URL Twilio will request when receiving a call
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    /**
     * Returns The If SIP registration is allowed.
     * 
     * @return If SIP registration is allowed
     */
    public final Boolean getSipRegistration() {
        return this.sipRegistration;
    }

    /**
     * Returns The Unique string to identify an associated trunk.
     * 
     * @return Unique string to identify an associated trunk
     */
    public final String getTrunkSid() {
        return this.trunkSid;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TerminatingSipDomain other = (TerminatingSipDomain) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(apiVersion, other.apiVersion) && 
               Objects.equals(authType, other.authType) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(domainName, other.domainName) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(url, other.url) && 
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) && 
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) && 
               Objects.equals(voiceMethod, other.voiceMethod) && 
               Objects.equals(voiceStatusCallbackMethod, other.voiceStatusCallbackMethod) && 
               Objects.equals(voiceStatusCallbackUrl, other.voiceStatusCallbackUrl) && 
               Objects.equals(voiceUrl, other.voiceUrl) && 
               Objects.equals(sipRegistration, other.sipRegistration) && 
               Objects.equals(trunkSid, other.trunkSid) && 
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            apiVersion,
                            authType,
                            dateCreated,
                            dateUpdated,
                            domainName,
                            friendlyName,
                            sid,
                            url,
                            voiceFallbackMethod,
                            voiceFallbackUrl,
                            voiceMethod,
                            voiceStatusCallbackMethod,
                            voiceStatusCallbackUrl,
                            voiceUrl,
                            sipRegistration,
                            trunkSid,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("apiVersion", apiVersion)
                          .add("authType", authType)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("domainName", domainName)
                          .add("friendlyName", friendlyName)
                          .add("sid", sid)
                          .add("url", url)
                          .add("voiceFallbackMethod", voiceFallbackMethod)
                          .add("voiceFallbackUrl", voiceFallbackUrl)
                          .add("voiceMethod", voiceMethod)
                          .add("voiceStatusCallbackMethod", voiceStatusCallbackMethod)
                          .add("voiceStatusCallbackUrl", voiceStatusCallbackUrl)
                          .add("voiceUrl", voiceUrl)
                          .add("sipRegistration", sipRegistration)
                          .add("trunkSid", trunkSid)
                          .add("links", links)
                          .toString();
    }
}