package com.worker8.redditapi.model.t1_comment.response

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.annotations.SerializedName
import com.worker8.redditapi.RedditApi
import com.worker8.redditapi.model.base.RedditObject
import com.worker8.redditapi.model.t1_comment.data.RedditReplyListingData
import java.io.Reader

data class RedditReplyListingObject(
    @SerializedName("data")
    override val value: RedditReplyListingData = RedditReplyListingData(),
    @SerializedName("kind")
    override val kind: String = "" // kind = "Listing"
) : RedditObject<RedditReplyListingData> {
    class Deserializer : ResponseDeserializable<RedditReplyListingObject> {
        override fun deserialize(reader: Reader) = RedditApi.gson.fromJson(reader, RedditReplyListingObject::class.java)
    }
}
