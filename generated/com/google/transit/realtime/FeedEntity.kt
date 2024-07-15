// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.FeedEntity in xyz/ksharma/transport/gtfs_realtime.proto
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
import com.squareup.wire.`internal`.missingRequiredFields
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
 * A definition (or update) of an entity in the transit feed.
 */
public class FeedEntity(
  /**
   * The ids are used only to provide incrementality support. The id should be
   * unique within a FeedMessage. Consequent FeedMessages may contain
   * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
   * FeedEntity with some id will replace the old FeedEntity with the same id
   * (or delete it - see is_deleted below).
   * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
   * feed must be specified by explicit selectors (see EntitySelector below for
   * more info).
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED,
    schemaIndex = 0,
  )
  @JvmField
  public val id: String,
  /**
   * Whether this entity is to be deleted. Relevant only for incremental
   * fetches.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    schemaIndex = 1,
  )
  @JvmField
  public val is_deleted: Boolean? = null,
  /**
   * Data about the entity itself. Exactly one of the following fields must be
   * present (unless the entity is being deleted).
   */
  @field:WireField(
    tag = 3,
    adapter = "com.google.transit.realtime.TripUpdate#ADAPTER",
    schemaIndex = 2,
  )
  @JvmField
  public val trip_update: TripUpdate? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.google.transit.realtime.VehiclePosition#ADAPTER",
    schemaIndex = 3,
  )
  @JvmField
  public val vehicle: VehiclePosition? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.google.transit.realtime.Alert#ADAPTER",
    schemaIndex = 4,
  )
  @JvmField
  public val alert: Alert? = null,
  /**
   * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
   * the future.
   */
  @field:WireField(
    tag = 6,
    adapter = "com.google.transit.realtime.Shape#ADAPTER",
    schemaIndex = 5,
  )
  @JvmField
  public val shape: Shape? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.google.transit.realtime.Stop#ADAPTER",
    schemaIndex = 6,
  )
  @JvmField
  public val stop: Stop? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.google.transit.realtime.TripModifications#ADAPTER",
    schemaIndex = 7,
  )
  @JvmField
  public val trip_modifications: TripModifications? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FeedEntity, FeedEntity.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.id = id
    builder.is_deleted = is_deleted
    builder.trip_update = trip_update
    builder.vehicle = vehicle
    builder.alert = alert
    builder.shape = shape
    builder.stop = stop
    builder.trip_modifications = trip_modifications
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FeedEntity) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (is_deleted != other.is_deleted) return false
    if (trip_update != other.trip_update) return false
    if (vehicle != other.vehicle) return false
    if (alert != other.alert) return false
    if (shape != other.shape) return false
    if (stop != other.stop) return false
    if (trip_modifications != other.trip_modifications) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + id.hashCode()
      result = result * 37 + (is_deleted?.hashCode() ?: 0)
      result = result * 37 + (trip_update?.hashCode() ?: 0)
      result = result * 37 + (vehicle?.hashCode() ?: 0)
      result = result * 37 + (alert?.hashCode() ?: 0)
      result = result * 37 + (shape?.hashCode() ?: 0)
      result = result * 37 + (stop?.hashCode() ?: 0)
      result = result * 37 + (trip_modifications?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """id=${sanitize(id)}"""
    if (is_deleted != null) result += """is_deleted=$is_deleted"""
    if (trip_update != null) result += """trip_update=$trip_update"""
    if (vehicle != null) result += """vehicle=$vehicle"""
    if (alert != null) result += """alert=$alert"""
    if (shape != null) result += """shape=$shape"""
    if (stop != null) result += """stop=$stop"""
    if (trip_modifications != null) result += """trip_modifications=$trip_modifications"""
    return result.joinToString(prefix = "FeedEntity{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: String = this.id,
    is_deleted: Boolean? = this.is_deleted,
    trip_update: TripUpdate? = this.trip_update,
    vehicle: VehiclePosition? = this.vehicle,
    alert: Alert? = this.alert,
    shape: Shape? = this.shape,
    stop: Stop? = this.stop,
    trip_modifications: TripModifications? = this.trip_modifications,
    unknownFields: ByteString = this.unknownFields,
  ): FeedEntity = FeedEntity(id, is_deleted, trip_update, vehicle, alert, shape, stop,
      trip_modifications, unknownFields)

  public class Builder : Message.Builder<FeedEntity, Builder>() {
    @JvmField
    public var id: String? = null

    @JvmField
    public var is_deleted: Boolean? = null

    @JvmField
    public var trip_update: TripUpdate? = null

    @JvmField
    public var vehicle: VehiclePosition? = null

    @JvmField
    public var alert: Alert? = null

    @JvmField
    public var shape: Shape? = null

    @JvmField
    public var stop: Stop? = null

    @JvmField
    public var trip_modifications: TripModifications? = null

    /**
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     */
    public fun id(id: String): Builder {
      this.id = id
      return this
    }

    /**
     * Whether this entity is to be deleted. Relevant only for incremental
     * fetches.
     */
    public fun is_deleted(is_deleted: Boolean?): Builder {
      this.is_deleted = is_deleted
      return this
    }

    /**
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     */
    public fun trip_update(trip_update: TripUpdate?): Builder {
      this.trip_update = trip_update
      return this
    }

    public fun vehicle(vehicle: VehiclePosition?): Builder {
      this.vehicle = vehicle
      return this
    }

    public fun alert(alert: Alert?): Builder {
      this.alert = alert
      return this
    }

    /**
     * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
     * the future.
     */
    public fun shape(shape: Shape?): Builder {
      this.shape = shape
      return this
    }

    public fun stop(stop: Stop?): Builder {
      this.stop = stop
      return this
    }

    public fun trip_modifications(trip_modifications: TripModifications?): Builder {
      this.trip_modifications = trip_modifications
      return this
    }

    override fun build(): FeedEntity = FeedEntity(
      id = id ?: throw missingRequiredFields(id, "id"),
      is_deleted = is_deleted,
      trip_update = trip_update,
      vehicle = vehicle,
      alert = alert,
      shape = shape,
      stop = stop,
      trip_modifications = trip_modifications,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    public const val DEFAULT_IS_DELETED: Boolean = false

    @JvmField
    public val ADAPTER: ProtoAdapter<FeedEntity> = object : ProtoAdapter<FeedEntity>(
      FieldEncoding.LENGTH_DELIMITED, 
      FeedEntity::class, 
      "type.googleapis.com/transit_realtime.FeedEntity", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: FeedEntity): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.id)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.is_deleted)
        size += TripUpdate.ADAPTER.encodedSizeWithTag(3, value.trip_update)
        size += VehiclePosition.ADAPTER.encodedSizeWithTag(4, value.vehicle)
        size += Alert.ADAPTER.encodedSizeWithTag(5, value.alert)
        size += Shape.ADAPTER.encodedSizeWithTag(6, value.shape)
        size += Stop.ADAPTER.encodedSizeWithTag(7, value.stop)
        size += TripModifications.ADAPTER.encodedSizeWithTag(8, value.trip_modifications)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FeedEntity) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_deleted)
        TripUpdate.ADAPTER.encodeWithTag(writer, 3, value.trip_update)
        VehiclePosition.ADAPTER.encodeWithTag(writer, 4, value.vehicle)
        Alert.ADAPTER.encodeWithTag(writer, 5, value.alert)
        Shape.ADAPTER.encodeWithTag(writer, 6, value.shape)
        Stop.ADAPTER.encodeWithTag(writer, 7, value.stop)
        TripModifications.ADAPTER.encodeWithTag(writer, 8, value.trip_modifications)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FeedEntity) {
        writer.writeBytes(value.unknownFields)
        TripModifications.ADAPTER.encodeWithTag(writer, 8, value.trip_modifications)
        Stop.ADAPTER.encodeWithTag(writer, 7, value.stop)
        Shape.ADAPTER.encodeWithTag(writer, 6, value.shape)
        Alert.ADAPTER.encodeWithTag(writer, 5, value.alert)
        VehiclePosition.ADAPTER.encodeWithTag(writer, 4, value.vehicle)
        TripUpdate.ADAPTER.encodeWithTag(writer, 3, value.trip_update)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_deleted)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
      }

      override fun decode(reader: ProtoReader): FeedEntity {
        var id: String? = null
        var is_deleted: Boolean? = null
        var trip_update: TripUpdate? = null
        var vehicle: VehiclePosition? = null
        var alert: Alert? = null
        var shape: Shape? = null
        var stop: Stop? = null
        var trip_modifications: TripModifications? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> id = ProtoAdapter.STRING.decode(reader)
            2 -> is_deleted = ProtoAdapter.BOOL.decode(reader)
            3 -> trip_update = TripUpdate.ADAPTER.decode(reader)
            4 -> vehicle = VehiclePosition.ADAPTER.decode(reader)
            5 -> alert = Alert.ADAPTER.decode(reader)
            6 -> shape = Shape.ADAPTER.decode(reader)
            7 -> stop = Stop.ADAPTER.decode(reader)
            8 -> trip_modifications = TripModifications.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FeedEntity(
          id = id ?: throw missingRequiredFields(id, "id"),
          is_deleted = is_deleted,
          trip_update = trip_update,
          vehicle = vehicle,
          alert = alert,
          shape = shape,
          stop = stop,
          trip_modifications = trip_modifications,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FeedEntity): FeedEntity = value.copy(
        trip_update = value.trip_update?.let(TripUpdate.ADAPTER::redact),
        vehicle = value.vehicle?.let(VehiclePosition.ADAPTER::redact),
        alert = value.alert?.let(Alert.ADAPTER::redact),
        shape = value.shape?.let(Shape.ADAPTER::redact),
        stop = value.stop?.let(Stop.ADAPTER::redact),
        trip_modifications = value.trip_modifications?.let(TripModifications.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): FeedEntity = Builder().apply(body).build()
  }
}
