// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.TranslatedImage in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package com.google.transit.realtime

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import okio.ByteString

/**
 * An internationalized image containing per-language versions of a URL linking to an image
 * along with meta information
 * Only one of the images from a message will be retained by consumers. The resolution proceeds
 * as follows:
 * 1. If the UI language matches the language code of a translation,
 *    the first matching translation is picked.
 * 2. If a default UI language (e.g., English) matches the language code of a
 *    translation, the first matching translation is picked.
 * 3. If some translation has an unspecified language code, that translation is
 *    picked.
 * NOTE: This field is still experimental, and subject to change. It may be formally adopted in the
 * future.
 */
public class TranslatedImage(
  localized_image: List<LocalizedImage> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TranslatedImage, TranslatedImage.Builder>(ADAPTER, unknownFields) {
  /**
   * At least one localized image must be provided.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.transit.realtime.TranslatedImage${'$'}LocalizedImage#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 0,
  )
  @JvmField
  public val localized_image: List<LocalizedImage> = immutableCopyOf("localized_image",
      localized_image)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.localized_image = localized_image
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TranslatedImage) return false
    if (unknownFields != other.unknownFields) return false
    if (localized_image != other.localized_image) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + localized_image.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (localized_image.isNotEmpty()) result += """localized_image=$localized_image"""
    return result.joinToString(prefix = "TranslatedImage{", separator = ", ", postfix = "}")
  }

  public fun copy(localized_image: List<LocalizedImage> = this.localized_image,
      unknownFields: ByteString = this.unknownFields): TranslatedImage =
      TranslatedImage(localized_image, unknownFields)

  public class Builder : Message.Builder<TranslatedImage, Builder>() {
    @JvmField
    public var localized_image: List<LocalizedImage> = emptyList()

    /**
     * At least one localized image must be provided.
     */
    public fun localized_image(localized_image: List<LocalizedImage>): Builder {
      checkElementsNotNull(localized_image)
      this.localized_image = localized_image
      return this
    }

    override fun build(): TranslatedImage = TranslatedImage(
      localized_image = localized_image,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TranslatedImage> = object : ProtoAdapter<TranslatedImage>(
      FieldEncoding.LENGTH_DELIMITED, 
      TranslatedImage::class, 
      "type.googleapis.com/transit_realtime.TranslatedImage", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: TranslatedImage): Int {
        var size = value.unknownFields.size
        size += LocalizedImage.ADAPTER.asRepeated().encodedSizeWithTag(1, value.localized_image)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TranslatedImage) {
        LocalizedImage.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.localized_image)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: TranslatedImage) {
        writer.writeBytes(value.unknownFields)
        LocalizedImage.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.localized_image)
      }

      override fun decode(reader: ProtoReader): TranslatedImage {
        val localized_image = mutableListOf<LocalizedImage>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> localized_image.add(LocalizedImage.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return TranslatedImage(
          localized_image = localized_image,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TranslatedImage): TranslatedImage = value.copy(
        localized_image = value.localized_image.redactElements(LocalizedImage.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): TranslatedImage =
        Builder().apply(body).build()
  }

  public class LocalizedImage(
    /**
     * String containing an URL linking to an image
     * The image linked must be less than 2MB.
     * If an image changes in a significant enough way that an update is required on the consumer
     * side, the producer must update the URL to a new one.
     * The URL should be a fully qualified URL that includes http:// or https://, and any special
     * characters in the URL must be correctly escaped. See the
     * following http://www.w3.org/Addressing/URL/4_URI_Recommentations.html for a description of how
     * to create fully qualified URL values.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      schemaIndex = 0,
    )
    @JvmField
    public val url: String,
    /**
     * IANA media type as to specify the type of image to be displayed.
     * The type must start with "image/"
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      schemaIndex = 1,
    )
    @JvmField
    public val media_type: String,
    /**
     * BCP-47 language code. Can be omitted if the language is unknown or if
     * no i18n is done at all for the feed. At most one translation is
     * allowed to have an unspecified language tag.
     */
    @field:WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      schemaIndex = 2,
    )
    @JvmField
    public val language: String? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<LocalizedImage, LocalizedImage.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.url = url
      builder.media_type = media_type
      builder.language = language
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is LocalizedImage) return false
      if (unknownFields != other.unknownFields) return false
      if (url != other.url) return false
      if (media_type != other.media_type) return false
      if (language != other.language) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + url.hashCode()
        result = result * 37 + media_type.hashCode()
        result = result * 37 + (language?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """url=${sanitize(url)}"""
      result += """media_type=${sanitize(media_type)}"""
      if (language != null) result += """language=${sanitize(language)}"""
      return result.joinToString(prefix = "LocalizedImage{", separator = ", ", postfix = "}")
    }

    public fun copy(
      url: String = this.url,
      media_type: String = this.media_type,
      language: String? = this.language,
      unknownFields: ByteString = this.unknownFields,
    ): LocalizedImage = LocalizedImage(url, media_type, language, unknownFields)

    public class Builder : Message.Builder<LocalizedImage, Builder>() {
      @JvmField
      public var url: String? = null

      @JvmField
      public var media_type: String? = null

      @JvmField
      public var language: String? = null

      /**
       * String containing an URL linking to an image
       * The image linked must be less than 2MB.
       * If an image changes in a significant enough way that an update is required on the consumer
       * side, the producer must update the URL to a new one.
       * The URL should be a fully qualified URL that includes http:// or https://, and any special
       * characters in the URL must be correctly escaped. See the
       * following http://www.w3.org/Addressing/URL/4_URI_Recommentations.html for a description of how
       * to create fully qualified URL values.
       */
      public fun url(url: String): Builder {
        this.url = url
        return this
      }

      /**
       * IANA media type as to specify the type of image to be displayed.
       * The type must start with "image/"
       */
      public fun media_type(media_type: String): Builder {
        this.media_type = media_type
        return this
      }

      /**
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       */
      public fun language(language: String?): Builder {
        this.language = language
        return this
      }

      override fun build(): LocalizedImage = LocalizedImage(
        url = url ?: throw missingRequiredFields(url, "url"),
        media_type = media_type ?: throw missingRequiredFields(media_type, "media_type"),
        language = language,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<LocalizedImage> = object : ProtoAdapter<LocalizedImage>(
        FieldEncoding.LENGTH_DELIMITED, 
        LocalizedImage::class, 
        "type.googleapis.com/transit_realtime.TranslatedImage.LocalizedImage", 
        PROTO_2, 
        null, 
        "xyz/ksharma/transport/gtfs_realtime.proto"
      ) {
        override fun encodedSize(`value`: LocalizedImage): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.url)
          size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.media_type)
          size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.language)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: LocalizedImage) {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url)
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.media_type)
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.language)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: LocalizedImage) {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.language)
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.media_type)
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url)
        }

        override fun decode(reader: ProtoReader): LocalizedImage {
          var url: String? = null
          var media_type: String? = null
          var language: String? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> url = ProtoAdapter.STRING.decode(reader)
              2 -> media_type = ProtoAdapter.STRING.decode(reader)
              3 -> language = ProtoAdapter.STRING.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return LocalizedImage(
            url = url ?: throw missingRequiredFields(url, "url"),
            media_type = media_type ?: throw missingRequiredFields(media_type, "media_type"),
            language = language,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: LocalizedImage): LocalizedImage = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      @JvmSynthetic
      public inline fun build(body: Builder.() -> Unit): LocalizedImage =
          Builder().apply(body).build()
    }
  }
}
