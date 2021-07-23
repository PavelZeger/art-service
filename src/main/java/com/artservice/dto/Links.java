package com.artservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 09/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

    String self;
    String user;
    String thumbnail;
    String image;
    String images;
    String partner;
    String artists;
    String permalink;
    String artworks;
    String artwork;
    String genes;
    String collection;
    String profile;
    String shows;
    String website;
    String owner;
    String bidders;

    @JsonProperty(value = "partner_contacts")
    String partnerContacts;

    @JsonProperty(value = "published_artworks")
    String publishedArtworks;

    @JsonProperty(value = "similar_artists")
    String similarArtists;

    @JsonProperty(value = "similar_contemporary_artists")
    String similarContemporaryArtists;

    @JsonProperty(value = "collection_users")
    String collectionUsers;

    @JsonProperty(value = "sale_artworks")
    String saleArtworks;

    @JsonProperty(value = "similar_artworks")
    String similarArtworks;

    @JsonProperty(value = "cover_image")
    String coverImage;

}
