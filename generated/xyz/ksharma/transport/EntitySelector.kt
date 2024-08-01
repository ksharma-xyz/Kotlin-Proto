// Code generated by Wire protocol buffer compiler, do not edit.
// Source: xyz.ksharma.transport.EntitySelector in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.transport

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
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okio.ByteString

/**
 * A selector for an entity in a GTFS feed.
 */
public class EntitySelector(
  /**
   * The values of the fields should correspond to the appropriate fields in the
   * GTFS feed.
   * At least one specifier must be given. If several are given, then the
   * matching has to apply to all the given specifiers.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val agency_id: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 1,
  )
  @JvmField
  public val route_id: String? = null,
  /**
   * corresponds to route_type in GTFS.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 2,
  )
  @JvmField
  public val route_type: Int? = null,
  @field:WireField(
    tag = 4,
    adapter = "xyz.ksharma.transport.TripDescriptor#ADAPTER",
    schemaIndex = 3,
  )
  @JvmField
  public val trip: TripDescriptor? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 4,
  )
  @JvmField
  public val stop_id: String? = null,
  /**
   * Corresponds to trip direction_id in GTFS trips.txt. If provided the
   * route_id must also be provided.
   */
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#UINT32",
    schemaIndex = 5,
  )
  @JvmField
  public val direction_id: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<EntitySelector, EntitySelector.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.agency_id = agency_id
    builder.route_id = route_id
    builder.route_type = route_type
    builder.trip = trip
    builder.stop_id = stop_id
    builder.direction_id = direction_id
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EntitySelector) return false
    if (unknownFields != other.unknownFields) return false
    if (agency_id != other.agency_id) return false
    if (route_id != other.route_id) return false
    if (route_type != other.route_type) return false
    if (trip != other.trip) return false
    if (stop_id != other.stop_id) return false
    if (direction_id != other.direction_id) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (agency_id?.hashCode() ?: 0)
      result = result * 37 + (route_id?.hashCode() ?: 0)
      result = result * 37 + (route_type?.hashCode() ?: 0)
      result = result * 37 + (trip?.hashCode() ?: 0)
      result = result * 37 + (stop_id?.hashCode() ?: 0)
      result = result * 37 + (direction_id?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (agency_id != null) result += """agency_id=${sanitize(agency_id)}"""
    if (route_id != null) result += """route_id=${sanitize(route_id)}"""
    if (route_type != null) result += """route_type=$route_type"""
    if (trip != null) result += """trip=$trip"""
    if (stop_id != null) result += """stop_id=${sanitize(stop_id)}"""
    if (direction_id != null) result += """direction_id=$direction_id"""
    return result.joinToString(prefix = "EntitySelector{", separator = ", ", postfix = "}")
  }

  public fun copy(
    agency_id: String? = this.agency_id,
    route_id: String? = this.route_id,
    route_type: Int? = this.route_type,
    trip: TripDescriptor? = this.trip,
    stop_id: String? = this.stop_id,
    direction_id: Int? = this.direction_id,
    unknownFields: ByteString = this.unknownFields,
  ): EntitySelector = EntitySelector(agency_id, route_id, route_type, trip, stop_id, direction_id,
      unknownFields)

  public class Builder : Message.Builder<EntitySelector, Builder>() {
    @JvmField
    public var agency_id: String? = null

    @JvmField
    public var route_id: String? = null

    @JvmField
    public var route_type: Int? = null

    @JvmField
    public var trip: TripDescriptor? = null

    @JvmField
    public var stop_id: String? = null

    @JvmField
    public var direction_id: Int? = null

    /**
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     */
    public fun agency_id(agency_id: String?): Builder {
      this.agency_id = agency_id
      return this
    }

    public fun route_id(route_id: String?): Builder {
      this.route_id = route_id
      return this
    }

    /**
     * corresponds to route_type in GTFS.
     */
    public fun route_type(route_type: Int?): Builder {
      this.route_type = route_type
      return this
    }

    public fun trip(trip: TripDescriptor?): Builder {
      this.trip = trip
      return this
    }

    public fun stop_id(stop_id: String?): Builder {
      this.stop_id = stop_id
      return this
    }

    /**
     * Corresponds to trip direction_id in GTFS trips.txt. If provided the
     * route_id must also be provided.
     */
    public fun direction_id(direction_id: Int?): Builder {
      this.direction_id = direction_id
      return this
    }

    override fun build(): EntitySelector = EntitySelector(
      agency_id = agency_id,
      route_id = route_id,
      route_type = route_type,
      trip = trip,
      stop_id = stop_id,
      direction_id = direction_id,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<EntitySelector> = object : ProtoAdapter<EntitySelector>(
      FieldEncoding.LENGTH_DELIMITED, 
      EntitySelector::class, 
      "type.googleapis.com/xyz.ksharma.transport.EntitySelector", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: EntitySelector): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.agency_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.route_id)
        size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.route_type)
        size += TripDescriptor.ADAPTER.encodedSizeWithTag(4, value.trip)
        size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.stop_id)
        size += ProtoAdapter.UINT32.encodedSizeWithTag(6, value.direction_id)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: EntitySelector) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.agency_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.route_id)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.route_type)
        TripDescriptor.ADAPTER.encodeWithTag(writer, 4, value.trip)
        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.stop_id)
        ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.direction_id)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: EntitySelector) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.direction_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.stop_id)
        TripDescriptor.ADAPTER.encodeWithTag(writer, 4, value.trip)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.route_type)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.route_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.agency_id)
      }

      override fun decode(reader: ProtoReader): EntitySelector {
        var agency_id: String? = null
        var route_id: String? = null
        var route_type: Int? = null
        var trip: TripDescriptor? = null
        var stop_id: String? = null
        var direction_id: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> agency_id = ProtoAdapter.STRING.decode(reader)
            2 -> route_id = ProtoAdapter.STRING.decode(reader)
            3 -> route_type = ProtoAdapter.INT32.decode(reader)
            4 -> trip = TripDescriptor.ADAPTER.decode(reader)
            5 -> stop_id = ProtoAdapter.STRING.decode(reader)
            6 -> direction_id = ProtoAdapter.UINT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EntitySelector(
          agency_id = agency_id,
          route_id = route_id,
          route_type = route_type,
          trip = trip,
          stop_id = stop_id,
          direction_id = direction_id,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: EntitySelector): EntitySelector = value.copy(
        trip = value.trip?.let(TripDescriptor.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): EntitySelector =
        Builder().apply(body).build()
  }
}