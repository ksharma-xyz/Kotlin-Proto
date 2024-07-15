// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.TripUpdate in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.transit.realtime

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
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

public class TripUpdate(
  @field:WireField(
    tag = 1,
    adapter = "xyz.ksharma.transit.realtime.TripDescriptor#ADAPTER",
    label = WireField.Label.REQUIRED,
    schemaIndex = 0,
  )
  @JvmField
  public val trip: TripDescriptor,
  @field:WireField(
    tag = 3,
    adapter = "xyz.ksharma.transit.realtime.VehicleDescriptor#ADAPTER",
    schemaIndex = 1,
  )
  @JvmField
  public val vehicle: VehicleDescriptor? = null,
  stop_time_update: List<StopTimeUpdate> = emptyList(),
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#UINT64",
    schemaIndex = 3,
  )
  @JvmField
  public val timestamp: Long? = null,
  /**
   * NEW
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 4,
  )
  @JvmField
  public val delay: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TripUpdate, TripUpdate.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 2,
    adapter = "xyz.ksharma.transit.realtime.TripUpdate${'$'}StopTimeUpdate#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 2,
  )
  @JvmField
  public val stop_time_update: List<StopTimeUpdate> = immutableCopyOf("stop_time_update",
      stop_time_update)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.trip = trip
    builder.vehicle = vehicle
    builder.stop_time_update = stop_time_update
    builder.timestamp = timestamp
    builder.delay = delay
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TripUpdate) return false
    if (unknownFields != other.unknownFields) return false
    if (trip != other.trip) return false
    if (vehicle != other.vehicle) return false
    if (stop_time_update != other.stop_time_update) return false
    if (timestamp != other.timestamp) return false
    if (delay != other.delay) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + trip.hashCode()
      result = result * 37 + (vehicle?.hashCode() ?: 0)
      result = result * 37 + stop_time_update.hashCode()
      result = result * 37 + (timestamp?.hashCode() ?: 0)
      result = result * 37 + (delay?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """trip=$trip"""
    if (vehicle != null) result += """vehicle=$vehicle"""
    if (stop_time_update.isNotEmpty()) result += """stop_time_update=$stop_time_update"""
    if (timestamp != null) result += """timestamp=$timestamp"""
    if (delay != null) result += """delay=$delay"""
    return result.joinToString(prefix = "TripUpdate{", separator = ", ", postfix = "}")
  }

  public fun copy(
    trip: TripDescriptor = this.trip,
    vehicle: VehicleDescriptor? = this.vehicle,
    stop_time_update: List<StopTimeUpdate> = this.stop_time_update,
    timestamp: Long? = this.timestamp,
    delay: Int? = this.delay,
    unknownFields: ByteString = this.unknownFields,
  ): TripUpdate = TripUpdate(trip, vehicle, stop_time_update, timestamp, delay, unknownFields)

  public class Builder : Message.Builder<TripUpdate, Builder>() {
    @JvmField
    public var trip: TripDescriptor? = null

    @JvmField
    public var vehicle: VehicleDescriptor? = null

    @JvmField
    public var stop_time_update: List<StopTimeUpdate> = emptyList()

    @JvmField
    public var timestamp: Long? = null

    @JvmField
    public var delay: Int? = null

    public fun trip(trip: TripDescriptor?): Builder {
      this.trip = trip
      return this
    }

    public fun vehicle(vehicle: VehicleDescriptor?): Builder {
      this.vehicle = vehicle
      return this
    }

    public fun stop_time_update(stop_time_update: List<StopTimeUpdate>): Builder {
      checkElementsNotNull(stop_time_update)
      this.stop_time_update = stop_time_update
      return this
    }

    public fun timestamp(timestamp: Long?): Builder {
      this.timestamp = timestamp
      return this
    }

    /**
     * NEW
     */
    public fun delay(delay: Int?): Builder {
      this.delay = delay
      return this
    }

    override fun build(): TripUpdate = TripUpdate(
      trip = trip ?: throw missingRequiredFields(trip, "trip"),
      vehicle = vehicle,
      stop_time_update = stop_time_update,
      timestamp = timestamp,
      delay = delay,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TripUpdate> = object : ProtoAdapter<TripUpdate>(
      FieldEncoding.LENGTH_DELIMITED, 
      TripUpdate::class, 
      "type.googleapis.com/transit_realtime.TripUpdate", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: TripUpdate): Int {
        var size = value.unknownFields.size
        size += TripDescriptor.ADAPTER.encodedSizeWithTag(1, value.trip)
        size += VehicleDescriptor.ADAPTER.encodedSizeWithTag(3, value.vehicle)
        size += StopTimeUpdate.ADAPTER.asRepeated().encodedSizeWithTag(2, value.stop_time_update)
        size += ProtoAdapter.UINT64.encodedSizeWithTag(4, value.timestamp)
        size += ProtoAdapter.INT32.encodedSizeWithTag(5, value.delay)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TripUpdate) {
        TripDescriptor.ADAPTER.encodeWithTag(writer, 1, value.trip)
        VehicleDescriptor.ADAPTER.encodeWithTag(writer, 3, value.vehicle)
        StopTimeUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.stop_time_update)
        ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.timestamp)
        ProtoAdapter.INT32.encodeWithTag(writer, 5, value.delay)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: TripUpdate) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.INT32.encodeWithTag(writer, 5, value.delay)
        ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.timestamp)
        StopTimeUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.stop_time_update)
        VehicleDescriptor.ADAPTER.encodeWithTag(writer, 3, value.vehicle)
        TripDescriptor.ADAPTER.encodeWithTag(writer, 1, value.trip)
      }

      override fun decode(reader: ProtoReader): TripUpdate {
        var trip: TripDescriptor? = null
        var vehicle: VehicleDescriptor? = null
        val stop_time_update = mutableListOf<StopTimeUpdate>()
        var timestamp: Long? = null
        var delay: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> trip = TripDescriptor.ADAPTER.decode(reader)
            3 -> vehicle = VehicleDescriptor.ADAPTER.decode(reader)
            2 -> stop_time_update.add(StopTimeUpdate.ADAPTER.decode(reader))
            4 -> timestamp = ProtoAdapter.UINT64.decode(reader)
            5 -> delay = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return TripUpdate(
          trip = trip ?: throw missingRequiredFields(trip, "trip"),
          vehicle = vehicle,
          stop_time_update = stop_time_update,
          timestamp = timestamp,
          delay = delay,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TripUpdate): TripUpdate = value.copy(
        trip = TripDescriptor.ADAPTER.redact(value.trip),
        vehicle = value.vehicle?.let(VehicleDescriptor.ADAPTER::redact),
        stop_time_update = value.stop_time_update.redactElements(StopTimeUpdate.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): TripUpdate = Builder().apply(body).build()
  }

  public class StopTimeEvent(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      schemaIndex = 0,
    )
    @JvmField
    public val delay: Int? = null,
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64",
      schemaIndex = 1,
    )
    @JvmField
    public val time: Long? = null,
    @field:WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      schemaIndex = 2,
    )
    @JvmField
    public val uncertainty: Int? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<StopTimeEvent, StopTimeEvent.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.delay = delay
      builder.time = time
      builder.uncertainty = uncertainty
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is StopTimeEvent) return false
      if (unknownFields != other.unknownFields) return false
      if (delay != other.delay) return false
      if (time != other.time) return false
      if (uncertainty != other.uncertainty) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (delay?.hashCode() ?: 0)
        result = result * 37 + (time?.hashCode() ?: 0)
        result = result * 37 + (uncertainty?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (delay != null) result += """delay=$delay"""
      if (time != null) result += """time=$time"""
      if (uncertainty != null) result += """uncertainty=$uncertainty"""
      return result.joinToString(prefix = "StopTimeEvent{", separator = ", ", postfix = "}")
    }

    public fun copy(
      delay: Int? = this.delay,
      time: Long? = this.time,
      uncertainty: Int? = this.uncertainty,
      unknownFields: ByteString = this.unknownFields,
    ): StopTimeEvent = StopTimeEvent(delay, time, uncertainty, unknownFields)

    public class Builder : Message.Builder<StopTimeEvent, Builder>() {
      @JvmField
      public var delay: Int? = null

      @JvmField
      public var time: Long? = null

      @JvmField
      public var uncertainty: Int? = null

      public fun delay(delay: Int?): Builder {
        this.delay = delay
        return this
      }

      public fun time(time: Long?): Builder {
        this.time = time
        return this
      }

      public fun uncertainty(uncertainty: Int?): Builder {
        this.uncertainty = uncertainty
        return this
      }

      override fun build(): StopTimeEvent = StopTimeEvent(
        delay = delay,
        time = time,
        uncertainty = uncertainty,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<StopTimeEvent> = object : ProtoAdapter<StopTimeEvent>(
        FieldEncoding.LENGTH_DELIMITED, 
        StopTimeEvent::class, 
        "type.googleapis.com/transit_realtime.TripUpdate.StopTimeEvent", 
        PROTO_2, 
        null, 
        "xyz/ksharma/transport/gtfs_realtime.proto"
      ) {
        override fun encodedSize(`value`: StopTimeEvent): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.delay)
          size += ProtoAdapter.INT64.encodedSizeWithTag(2, value.time)
          size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.uncertainty)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: StopTimeEvent) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.delay)
          ProtoAdapter.INT64.encodeWithTag(writer, 2, value.time)
          ProtoAdapter.INT32.encodeWithTag(writer, 3, value.uncertainty)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: StopTimeEvent) {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.INT32.encodeWithTag(writer, 3, value.uncertainty)
          ProtoAdapter.INT64.encodeWithTag(writer, 2, value.time)
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.delay)
        }

        override fun decode(reader: ProtoReader): StopTimeEvent {
          var delay: Int? = null
          var time: Long? = null
          var uncertainty: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> delay = ProtoAdapter.INT32.decode(reader)
              2 -> time = ProtoAdapter.INT64.decode(reader)
              3 -> uncertainty = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return StopTimeEvent(
            delay = delay,
            time = time,
            uncertainty = uncertainty,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: StopTimeEvent): StopTimeEvent = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      @JvmSynthetic
      public inline fun build(body: Builder.() -> Unit): StopTimeEvent =
          Builder().apply(body).build()
    }
  }

  public class StopTimeUpdate(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32",
      schemaIndex = 0,
    )
    @JvmField
    public val stop_sequence: Int? = null,
    @field:WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      schemaIndex = 1,
    )
    @JvmField
    public val stop_id: String? = null,
    @field:WireField(
      tag = 2,
      adapter = "xyz.ksharma.transit.realtime.TripUpdate${'$'}StopTimeEvent#ADAPTER",
      schemaIndex = 2,
    )
    @JvmField
    public val arrival: StopTimeEvent? = null,
    @field:WireField(
      tag = 3,
      adapter = "xyz.ksharma.transit.realtime.TripUpdate${'$'}StopTimeEvent#ADAPTER",
      schemaIndex = 3,
    )
    @JvmField
    public val departure: StopTimeEvent? = null,
    @field:WireField(
      tag = 5,
      adapter =
          "xyz.ksharma.transit.realtime.TripUpdate${'$'}StopTimeUpdate${'$'}ScheduleRelationship#ADAPTER",
      schemaIndex = 4,
    )
    @JvmField
    public val schedule_relationship: ScheduleRelationship? = null,
    @field:WireField(
      tag = 6,
      adapter =
          "xyz.ksharma.transit.realtime.TripUpdate${'$'}StopTimeUpdate${'$'}OccupancyStatus#ADAPTER",
      schemaIndex = 5,
    )
    @JvmField
    public val departure_occupancy_status: OccupancyStatus? = null,
    carriage_seq_predictive_occupancy: List<CarriageDescriptor> = emptyList(),
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<StopTimeUpdate, StopTimeUpdate.Builder>(ADAPTER, unknownFields) {
    /**
     * NEW - 22/2/22 - Predictive Real Time Occupancy added to TripUpdate->Stop Time Update
     * Extension source: xyz/ksharma/transport/gtfs_realtime.proto
     */
    @field:WireField(
      tag = 1_007,
      adapter = "xyz.ksharma.transit.realtime.CarriageDescriptor#ADAPTER",
      label = WireField.Label.REPEATED,
      schemaIndex = 6,
    )
    @JvmField
    public val carriage_seq_predictive_occupancy: List<CarriageDescriptor> =
        immutableCopyOf("carriage_seq_predictive_occupancy", carriage_seq_predictive_occupancy)

    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.stop_sequence = stop_sequence
      builder.stop_id = stop_id
      builder.arrival = arrival
      builder.departure = departure
      builder.schedule_relationship = schedule_relationship
      builder.departure_occupancy_status = departure_occupancy_status
      builder.carriage_seq_predictive_occupancy = carriage_seq_predictive_occupancy
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is StopTimeUpdate) return false
      if (unknownFields != other.unknownFields) return false
      if (stop_sequence != other.stop_sequence) return false
      if (stop_id != other.stop_id) return false
      if (arrival != other.arrival) return false
      if (departure != other.departure) return false
      if (schedule_relationship != other.schedule_relationship) return false
      if (departure_occupancy_status != other.departure_occupancy_status) return false
      if (carriage_seq_predictive_occupancy != other.carriage_seq_predictive_occupancy) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (stop_sequence?.hashCode() ?: 0)
        result = result * 37 + (stop_id?.hashCode() ?: 0)
        result = result * 37 + (arrival?.hashCode() ?: 0)
        result = result * 37 + (departure?.hashCode() ?: 0)
        result = result * 37 + (schedule_relationship?.hashCode() ?: 0)
        result = result * 37 + (departure_occupancy_status?.hashCode() ?: 0)
        result = result * 37 + carriage_seq_predictive_occupancy.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (stop_sequence != null) result += """stop_sequence=$stop_sequence"""
      if (stop_id != null) result += """stop_id=${sanitize(stop_id)}"""
      if (arrival != null) result += """arrival=$arrival"""
      if (departure != null) result += """departure=$departure"""
      if (schedule_relationship != null) result +=
          """schedule_relationship=$schedule_relationship"""
      if (departure_occupancy_status != null) result +=
          """departure_occupancy_status=$departure_occupancy_status"""
      if (carriage_seq_predictive_occupancy.isNotEmpty()) result +=
          """carriage_seq_predictive_occupancy=$carriage_seq_predictive_occupancy"""
      return result.joinToString(prefix = "StopTimeUpdate{", separator = ", ", postfix = "}")
    }

    public fun copy(
      stop_sequence: Int? = this.stop_sequence,
      stop_id: String? = this.stop_id,
      arrival: StopTimeEvent? = this.arrival,
      departure: StopTimeEvent? = this.departure,
      schedule_relationship: ScheduleRelationship? = this.schedule_relationship,
      departure_occupancy_status: OccupancyStatus? = this.departure_occupancy_status,
      carriage_seq_predictive_occupancy: List<CarriageDescriptor> =
          this.carriage_seq_predictive_occupancy,
      unknownFields: ByteString = this.unknownFields,
    ): StopTimeUpdate = StopTimeUpdate(stop_sequence, stop_id, arrival, departure,
        schedule_relationship, departure_occupancy_status, carriage_seq_predictive_occupancy,
        unknownFields)

    public class Builder : Message.Builder<StopTimeUpdate, Builder>() {
      @JvmField
      public var stop_sequence: Int? = null

      @JvmField
      public var stop_id: String? = null

      @JvmField
      public var arrival: StopTimeEvent? = null

      @JvmField
      public var departure: StopTimeEvent? = null

      @JvmField
      public var schedule_relationship: ScheduleRelationship? = null

      @JvmField
      public var departure_occupancy_status: OccupancyStatus? = null

      @JvmField
      public var carriage_seq_predictive_occupancy: List<CarriageDescriptor> = emptyList()

      public fun stop_sequence(stop_sequence: Int?): Builder {
        this.stop_sequence = stop_sequence
        return this
      }

      public fun stop_id(stop_id: String?): Builder {
        this.stop_id = stop_id
        return this
      }

      public fun arrival(arrival: StopTimeEvent?): Builder {
        this.arrival = arrival
        return this
      }

      public fun departure(departure: StopTimeEvent?): Builder {
        this.departure = departure
        return this
      }

      public fun schedule_relationship(schedule_relationship: ScheduleRelationship?): Builder {
        this.schedule_relationship = schedule_relationship
        return this
      }

      public fun departure_occupancy_status(departure_occupancy_status: OccupancyStatus?): Builder {
        this.departure_occupancy_status = departure_occupancy_status
        return this
      }

      /**
       * NEW - 22/2/22 - Predictive Real Time Occupancy added to TripUpdate->Stop Time Update
       */
      public
          fun carriage_seq_predictive_occupancy(carriage_seq_predictive_occupancy: List<CarriageDescriptor>):
          Builder {
        checkElementsNotNull(carriage_seq_predictive_occupancy)
        this.carriage_seq_predictive_occupancy = carriage_seq_predictive_occupancy
        return this
      }

      override fun build(): StopTimeUpdate = StopTimeUpdate(
        stop_sequence = stop_sequence,
        stop_id = stop_id,
        arrival = arrival,
        departure = departure,
        schedule_relationship = schedule_relationship,
        departure_occupancy_status = departure_occupancy_status,
        carriage_seq_predictive_occupancy = carriage_seq_predictive_occupancy,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val DEFAULT_SCHEDULE_RELATIONSHIP: ScheduleRelationship =
          ScheduleRelationship.SCHEDULED

      @JvmField
      public val ADAPTER: ProtoAdapter<StopTimeUpdate> = object : ProtoAdapter<StopTimeUpdate>(
        FieldEncoding.LENGTH_DELIMITED, 
        StopTimeUpdate::class, 
        "type.googleapis.com/transit_realtime.TripUpdate.StopTimeUpdate", 
        PROTO_2, 
        null, 
        "xyz/ksharma/transport/gtfs_realtime.proto"
      ) {
        override fun encodedSize(`value`: StopTimeUpdate): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.UINT32.encodedSizeWithTag(1, value.stop_sequence)
          size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.stop_id)
          size += StopTimeEvent.ADAPTER.encodedSizeWithTag(2, value.arrival)
          size += StopTimeEvent.ADAPTER.encodedSizeWithTag(3, value.departure)
          size += ScheduleRelationship.ADAPTER.encodedSizeWithTag(5, value.schedule_relationship)
          size += OccupancyStatus.ADAPTER.encodedSizeWithTag(6, value.departure_occupancy_status)
          size += CarriageDescriptor.ADAPTER.asRepeated().encodedSizeWithTag(1_007,
              value.carriage_seq_predictive_occupancy)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: StopTimeUpdate) {
          ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.stop_sequence)
          ProtoAdapter.STRING.encodeWithTag(writer, 4, value.stop_id)
          StopTimeEvent.ADAPTER.encodeWithTag(writer, 2, value.arrival)
          StopTimeEvent.ADAPTER.encodeWithTag(writer, 3, value.departure)
          ScheduleRelationship.ADAPTER.encodeWithTag(writer, 5, value.schedule_relationship)
          OccupancyStatus.ADAPTER.encodeWithTag(writer, 6, value.departure_occupancy_status)
          CarriageDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 1_007,
              value.carriage_seq_predictive_occupancy)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: StopTimeUpdate) {
          writer.writeBytes(value.unknownFields)
          CarriageDescriptor.ADAPTER.asRepeated().encodeWithTag(writer, 1_007,
              value.carriage_seq_predictive_occupancy)
          OccupancyStatus.ADAPTER.encodeWithTag(writer, 6, value.departure_occupancy_status)
          ScheduleRelationship.ADAPTER.encodeWithTag(writer, 5, value.schedule_relationship)
          StopTimeEvent.ADAPTER.encodeWithTag(writer, 3, value.departure)
          StopTimeEvent.ADAPTER.encodeWithTag(writer, 2, value.arrival)
          ProtoAdapter.STRING.encodeWithTag(writer, 4, value.stop_id)
          ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.stop_sequence)
        }

        override fun decode(reader: ProtoReader): StopTimeUpdate {
          var stop_sequence: Int? = null
          var stop_id: String? = null
          var arrival: StopTimeEvent? = null
          var departure: StopTimeEvent? = null
          var schedule_relationship: ScheduleRelationship? = null
          var departure_occupancy_status: OccupancyStatus? = null
          val carriage_seq_predictive_occupancy = mutableListOf<CarriageDescriptor>()
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> stop_sequence = ProtoAdapter.UINT32.decode(reader)
              4 -> stop_id = ProtoAdapter.STRING.decode(reader)
              2 -> arrival = StopTimeEvent.ADAPTER.decode(reader)
              3 -> departure = StopTimeEvent.ADAPTER.decode(reader)
              5 -> try {
                schedule_relationship = ScheduleRelationship.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              6 -> try {
                departure_occupancy_status = OccupancyStatus.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              1_007 ->
                  carriage_seq_predictive_occupancy.add(CarriageDescriptor.ADAPTER.decode(reader))
              else -> reader.readUnknownField(tag)
            }
          }
          return StopTimeUpdate(
            stop_sequence = stop_sequence,
            stop_id = stop_id,
            arrival = arrival,
            departure = departure,
            schedule_relationship = schedule_relationship,
            departure_occupancy_status = departure_occupancy_status,
            carriage_seq_predictive_occupancy = carriage_seq_predictive_occupancy,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: StopTimeUpdate): StopTimeUpdate = value.copy(
          arrival = value.arrival?.let(StopTimeEvent.ADAPTER::redact),
          departure = value.departure?.let(StopTimeEvent.ADAPTER::redact),
          carriage_seq_predictive_occupancy =
              value.carriage_seq_predictive_occupancy.redactElements(CarriageDescriptor.ADAPTER),
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      @JvmSynthetic
      public inline fun build(body: Builder.() -> Unit): StopTimeUpdate =
          Builder().apply(body).build()
    }

    public enum class ScheduleRelationship(
      override val `value`: Int,
    ) : WireEnum {
      SCHEDULED(0),
      SKIPPED(1),
      NO_DATA(2),
      /**
       * NEW
       */
      UNSCHEDULED(3),
      ;

      public companion object {
        @JvmField
        public val ADAPTER: ProtoAdapter<ScheduleRelationship> = object :
            EnumAdapter<ScheduleRelationship>(
          ScheduleRelationship::class, 
          PROTO_2, 
          ScheduleRelationship.SCHEDULED
        ) {
          override fun fromValue(`value`: Int): ScheduleRelationship? =
              ScheduleRelationship.fromValue(`value`)
        }

        @JvmStatic
        public fun fromValue(`value`: Int): ScheduleRelationship? = when (`value`) {
          0 -> SCHEDULED
          1 -> SKIPPED
          2 -> NO_DATA
          3 -> UNSCHEDULED
          else -> null
        }
      }
    }

    public enum class OccupancyStatus(
      override val `value`: Int,
    ) : WireEnum {
      EMPTY(0),
      MANY_SEATS_AVAILABLE(1),
      FEW_SEATS_AVAILABLE(2),
      STANDING_ROOM_ONLY(3),
      CRUSHED_STANDING_ROOM_ONLY(4),
      FULL(5),
      NOT_ACCEPTING_PASSENGERS(6),
      ;

      public companion object {
        @JvmField
        public val ADAPTER: ProtoAdapter<OccupancyStatus> = object : EnumAdapter<OccupancyStatus>(
          OccupancyStatus::class, 
          PROTO_2, 
          OccupancyStatus.EMPTY
        ) {
          override fun fromValue(`value`: Int): OccupancyStatus? =
              OccupancyStatus.fromValue(`value`)
        }

        @JvmStatic
        public fun fromValue(`value`: Int): OccupancyStatus? = when (`value`) {
          0 -> EMPTY
          1 -> MANY_SEATS_AVAILABLE
          2 -> FEW_SEATS_AVAILABLE
          3 -> STANDING_ROOM_ONLY
          4 -> CRUSHED_STANDING_ROOM_ONLY
          5 -> FULL
          6 -> NOT_ACCEPTING_PASSENGERS
          else -> null
        }
      }
    }
  }
}