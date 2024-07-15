// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.FeedMessage in xyz/ksharma/transport/gtfs_realtime.proto
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
 * The contents of a feed message.
 * A feed is a continuous stream of feed messages. Each message in the stream is
 * obtained as a response to an appropriate HTTP GET request.
 * A realtime feed is always defined with relation to an existing GTFS feed.
 * All the entity ids are resolved with respect to the GTFS feed.
 * Note that "required" and "optional" as stated in this file refer to Protocol
 * Buffer cardinality, not semantic cardinality.  See reference.md at
 * https://github.com/google/transit/tree/master/gtfs-realtime for field
 * semantic cardinality.
 */
public class FeedMessage(
  /**
   * Metadata about this feed and feed message.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.transit.realtime.FeedHeader#ADAPTER",
    label = WireField.Label.REQUIRED,
    declaredName = "header",
    schemaIndex = 0,
  )
  @JvmField
  public val header_: FeedHeader,
  entity: List<FeedEntity> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FeedMessage, FeedMessage.Builder>(ADAPTER, unknownFields) {
  /**
   * Contents of the feed.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.google.transit.realtime.FeedEntity#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 1,
  )
  @JvmField
  public val entity: List<FeedEntity> = immutableCopyOf("entity", entity)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.header_ = header_
    builder.entity = entity
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FeedMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (header_ != other.header_) return false
    if (entity != other.entity) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + header_.hashCode()
      result = result * 37 + entity.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """header_=$header_"""
    if (entity.isNotEmpty()) result += """entity=$entity"""
    return result.joinToString(prefix = "FeedMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(
    header_: FeedHeader = this.header_,
    entity: List<FeedEntity> = this.entity,
    unknownFields: ByteString = this.unknownFields,
  ): FeedMessage = FeedMessage(header_, entity, unknownFields)

  public class Builder : Message.Builder<FeedMessage, Builder>() {
    @JvmField
    public var header_: FeedHeader? = null

    @JvmField
    public var entity: List<FeedEntity> = emptyList()

    /**
     * Metadata about this feed and feed message.
     */
    public fun header_(header_: FeedHeader?): Builder {
      this.header_ = header_
      return this
    }

    /**
     * Contents of the feed.
     */
    public fun entity(entity: List<FeedEntity>): Builder {
      checkElementsNotNull(entity)
      this.entity = entity
      return this
    }

    override fun build(): FeedMessage = FeedMessage(
      header_ = header_ ?: throw missingRequiredFields(header_, "header_"),
      entity = entity,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FeedMessage> = object : ProtoAdapter<FeedMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      FeedMessage::class, 
      "type.googleapis.com/transit_realtime.FeedMessage", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: FeedMessage): Int {
        var size = value.unknownFields.size
        size += FeedHeader.ADAPTER.encodedSizeWithTag(1, value.header_)
        size += FeedEntity.ADAPTER.asRepeated().encodedSizeWithTag(2, value.entity)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FeedMessage) {
        FeedHeader.ADAPTER.encodeWithTag(writer, 1, value.header_)
        FeedEntity.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.entity)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FeedMessage) {
        writer.writeBytes(value.unknownFields)
        FeedEntity.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.entity)
        FeedHeader.ADAPTER.encodeWithTag(writer, 1, value.header_)
      }

      override fun decode(reader: ProtoReader): FeedMessage {
        var header_: FeedHeader? = null
        val entity = mutableListOf<FeedEntity>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> header_ = FeedHeader.ADAPTER.decode(reader)
            2 -> entity.add(FeedEntity.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return FeedMessage(
          header_ = header_ ?: throw missingRequiredFields(header_, "header"),
          entity = entity,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FeedMessage): FeedMessage = value.copy(
        header_ = FeedHeader.ADAPTER.redact(value.header_),
        entity = value.entity.redactElements(FeedEntity.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): FeedMessage = Builder().apply(body).build()
  }
}
