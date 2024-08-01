// Code generated by Wire protocol buffer compiler, do not edit.
// Source: xyz.ksharma.transport.TripDescriptor in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.transport

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
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okio.ByteString

/**
 * A descriptor that identifies an instance of a GTFS trip, or all instances of
 * a trip along a route.
 * - To specify a single trip instance, the trip_id (and if necessary,
 *   start_time) is set. If route_id is also set, then it should be same as one
 *   that the given trip corresponds to.
 * - To specify all the trips along a given route, only the route_id should be
 *   set. Note that if the trip_id is not known, then stop sequence ids in
 *   TripUpdate are not sufficient, and stop_ids must be provided as well. In
 *   addition, absolute arrival/departure times must be provided.
 */
public class TripDescriptor(
  /**
   * The trip_id from the GTFS feed that this selector refers to.
   * For non frequency-based trips, this field is enough to uniquely identify
   * the trip. For frequency-based trip, start_time and start_date might also be
   * necessary. When schedule_relationship is DUPLICATED within a TripUpdate, the trip_id identifies
   * the trip from
   * static GTFS to be duplicated. When schedule_relationship is DUPLICATED within a
   * VehiclePosition, the trip_id
   * identifies the new duplicate trip and must contain the value for the corresponding
   * TripUpdate.TripProperties.trip_id.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val trip_id: String? = null,
  /**
   * The route_id from the GTFS that this selector refers to.
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 1,
  )
  @JvmField
  public val route_id: String? = null,
  /**
   * The direction_id from the GTFS feed trips.txt file, indicating the
   * direction of travel for trips this selector refers to.
   */
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#UINT32",
    schemaIndex = 2,
  )
  @JvmField
  public val direction_id: Int? = null,
  /**
   * The initially scheduled start time of this trip instance.
   * When the trip_id corresponds to a non-frequency-based trip, this field
   * should either be omitted or be equal to the value in the GTFS feed. When
   * the trip_id correponds to a frequency-based trip, the start_time must be
   * specified for trip updates and vehicle positions. If the trip corresponds
   * to exact_times=1 GTFS record, then start_time must be some multiple
   * (including zero) of headway_secs later than frequencies.txt start_time for
   * the corresponding time period. If the trip corresponds to exact_times=0,
   * then its start_time may be arbitrary, and is initially expected to be the
   * first departure of the trip. Once established, the start_time of this
   * frequency-based trip should be considered immutable, even if the first
   * departure time changes -- that time change may instead be reflected in a
   * StopTimeUpdate.
   * Format and semantics of the field is same as that of
   * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 3,
  )
  @JvmField
  public val start_time: String? = null,
  /**
   * The scheduled start date of this trip instance.
   * Must be provided to disambiguate trips that are so late as to collide with
   * a scheduled trip on a next day. For example, for a train that departs 8:00
   * and 20:00 every day, and is 12 hours late, there would be two distinct
   * trips on the same time.
   * This field can be provided but is not mandatory for schedules in which such
   * collisions are impossible - for example, a service running on hourly
   * schedule where a vehicle that is one hour late is not considered to be
   * related to schedule anymore.
   * In YYYYMMDD format.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 4,
  )
  @JvmField
  public val start_date: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "xyz.ksharma.transport.TripDescriptor${'$'}ScheduleRelationship#ADAPTER",
    schemaIndex = 5,
  )
  @JvmField
  public val schedule_relationship: ScheduleRelationship? = null,
  @field:WireField(
    tag = 7,
    adapter = "xyz.ksharma.transport.TripDescriptor${'$'}ModifiedTripSelector#ADAPTER",
    schemaIndex = 6,
  )
  @JvmField
  public val modified_trip: ModifiedTripSelector? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TripDescriptor, TripDescriptor.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.trip_id = trip_id
    builder.route_id = route_id
    builder.direction_id = direction_id
    builder.start_time = start_time
    builder.start_date = start_date
    builder.schedule_relationship = schedule_relationship
    builder.modified_trip = modified_trip
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TripDescriptor) return false
    if (unknownFields != other.unknownFields) return false
    if (trip_id != other.trip_id) return false
    if (route_id != other.route_id) return false
    if (direction_id != other.direction_id) return false
    if (start_time != other.start_time) return false
    if (start_date != other.start_date) return false
    if (schedule_relationship != other.schedule_relationship) return false
    if (modified_trip != other.modified_trip) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (trip_id?.hashCode() ?: 0)
      result = result * 37 + (route_id?.hashCode() ?: 0)
      result = result * 37 + (direction_id?.hashCode() ?: 0)
      result = result * 37 + (start_time?.hashCode() ?: 0)
      result = result * 37 + (start_date?.hashCode() ?: 0)
      result = result * 37 + (schedule_relationship?.hashCode() ?: 0)
      result = result * 37 + (modified_trip?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (trip_id != null) result += """trip_id=${sanitize(trip_id)}"""
    if (route_id != null) result += """route_id=${sanitize(route_id)}"""
    if (direction_id != null) result += """direction_id=$direction_id"""
    if (start_time != null) result += """start_time=${sanitize(start_time)}"""
    if (start_date != null) result += """start_date=${sanitize(start_date)}"""
    if (schedule_relationship != null) result += """schedule_relationship=$schedule_relationship"""
    if (modified_trip != null) result += """modified_trip=$modified_trip"""
    return result.joinToString(prefix = "TripDescriptor{", separator = ", ", postfix = "}")
  }

  public fun copy(
    trip_id: String? = this.trip_id,
    route_id: String? = this.route_id,
    direction_id: Int? = this.direction_id,
    start_time: String? = this.start_time,
    start_date: String? = this.start_date,
    schedule_relationship: ScheduleRelationship? = this.schedule_relationship,
    modified_trip: ModifiedTripSelector? = this.modified_trip,
    unknownFields: ByteString = this.unknownFields,
  ): TripDescriptor = TripDescriptor(trip_id, route_id, direction_id, start_time, start_date,
      schedule_relationship, modified_trip, unknownFields)

  public class Builder : Message.Builder<TripDescriptor, Builder>() {
    @JvmField
    public var trip_id: String? = null

    @JvmField
    public var route_id: String? = null

    @JvmField
    public var direction_id: Int? = null

    @JvmField
    public var start_time: String? = null

    @JvmField
    public var start_date: String? = null

    @JvmField
    public var schedule_relationship: ScheduleRelationship? = null

    @JvmField
    public var modified_trip: ModifiedTripSelector? = null

    /**
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary. When schedule_relationship is DUPLICATED within a TripUpdate, the trip_id
     * identifies the trip from
     * static GTFS to be duplicated. When schedule_relationship is DUPLICATED within a
     * VehiclePosition, the trip_id
     * identifies the new duplicate trip and must contain the value for the corresponding
     * TripUpdate.TripProperties.trip_id.
     */
    public fun trip_id(trip_id: String?): Builder {
      this.trip_id = trip_id
      return this
    }

    /**
     * The route_id from the GTFS that this selector refers to.
     */
    public fun route_id(route_id: String?): Builder {
      this.route_id = route_id
      return this
    }

    /**
     * The direction_id from the GTFS feed trips.txt file, indicating the
     * direction of travel for trips this selector refers to.
     */
    public fun direction_id(direction_id: Int?): Builder {
      this.direction_id = direction_id
      return this
    }

    /**
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     */
    public fun start_time(start_time: String?): Builder {
      this.start_time = start_time
      return this
    }

    /**
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     */
    public fun start_date(start_date: String?): Builder {
      this.start_date = start_date
      return this
    }

    public fun schedule_relationship(schedule_relationship: ScheduleRelationship?): Builder {
      this.schedule_relationship = schedule_relationship
      return this
    }

    public fun modified_trip(modified_trip: ModifiedTripSelector?): Builder {
      this.modified_trip = modified_trip
      return this
    }

    override fun build(): TripDescriptor = TripDescriptor(
      trip_id = trip_id,
      route_id = route_id,
      direction_id = direction_id,
      start_time = start_time,
      start_date = start_date,
      schedule_relationship = schedule_relationship,
      modified_trip = modified_trip,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TripDescriptor> = object : ProtoAdapter<TripDescriptor>(
      FieldEncoding.LENGTH_DELIMITED, 
      TripDescriptor::class, 
      "type.googleapis.com/xyz.ksharma.transport.TripDescriptor", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: TripDescriptor): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.trip_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.route_id)
        size += ProtoAdapter.UINT32.encodedSizeWithTag(6, value.direction_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.start_time)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.start_date)
        size += ScheduleRelationship.ADAPTER.encodedSizeWithTag(4, value.schedule_relationship)
        size += ModifiedTripSelector.ADAPTER.encodedSizeWithTag(7, value.modified_trip)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TripDescriptor) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.trip_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.route_id)
        ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.direction_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.start_time)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.start_date)
        ScheduleRelationship.ADAPTER.encodeWithTag(writer, 4, value.schedule_relationship)
        ModifiedTripSelector.ADAPTER.encodeWithTag(writer, 7, value.modified_trip)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: TripDescriptor) {
        writer.writeBytes(value.unknownFields)
        ModifiedTripSelector.ADAPTER.encodeWithTag(writer, 7, value.modified_trip)
        ScheduleRelationship.ADAPTER.encodeWithTag(writer, 4, value.schedule_relationship)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.start_date)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.start_time)
        ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.direction_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 5, value.route_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.trip_id)
      }

      override fun decode(reader: ProtoReader): TripDescriptor {
        var trip_id: String? = null
        var route_id: String? = null
        var direction_id: Int? = null
        var start_time: String? = null
        var start_date: String? = null
        var schedule_relationship: ScheduleRelationship? = null
        var modified_trip: ModifiedTripSelector? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> trip_id = ProtoAdapter.STRING.decode(reader)
            5 -> route_id = ProtoAdapter.STRING.decode(reader)
            6 -> direction_id = ProtoAdapter.UINT32.decode(reader)
            2 -> start_time = ProtoAdapter.STRING.decode(reader)
            3 -> start_date = ProtoAdapter.STRING.decode(reader)
            4 -> try {
              schedule_relationship = ScheduleRelationship.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            7 -> modified_trip = ModifiedTripSelector.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return TripDescriptor(
          trip_id = trip_id,
          route_id = route_id,
          direction_id = direction_id,
          start_time = start_time,
          start_date = start_date,
          schedule_relationship = schedule_relationship,
          modified_trip = modified_trip,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TripDescriptor): TripDescriptor = value.copy(
        modified_trip = value.modified_trip?.let(ModifiedTripSelector.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): TripDescriptor =
        Builder().apply(body).build()
  }

  /**
   * The relation between this trip and the static schedule. If a trip is done
   * in accordance with temporary schedule, not reflected in GTFS, then it
   * shouldn't be marked as SCHEDULED, but likely as ADDED.
   */
  public enum class ScheduleRelationship(
    override val `value`: Int,
  ) : WireEnum {
    /**
     * Trip that is running in accordance with its GTFS schedule, or is close
     * enough to the scheduled trip to be associated with it.
     */
    SCHEDULED(0),
    /**
     * An extra trip that was added in addition to a running schedule, for
     * example, to replace a broken vehicle or to respond to sudden passenger
     * load.
     * NOTE: Currently, behavior is unspecified for feeds that use this mode. There are discussions
     * on the GTFS GitHub
     * \[(1)\](https://github.com/google/transit/issues/106)
     * \[(2)\](https://github.com/google/transit/pull/221)
     * \[(3)\](https://github.com/google/transit/pull/219) around fully specifying or deprecating
     * ADDED trips and the
     * documentation will be updated when those discussions are finalized.
     */
    ADDED(1),
    /**
     * A trip that is running with no schedule associated to it (GTFS frequencies.txt
     * exact_times=0).
     * Trips with ScheduleRelationship=UNSCHEDULED must also set all
     * StopTimeUpdates.ScheduleRelationship=UNSCHEDULED.
     */
    UNSCHEDULED(2),
    /**
     * A trip that existed in the schedule but was removed.
     */
    CANCELED(3),
    /**
     * Should not be used - for backwards-compatibility only.
     */
    @Deprecated(message = "REPLACEMENT is deprecated")
    REPLACEMENT(5),
    /**
     * An extra trip that was added in addition to a running schedule, for example, to replace a
     * broken vehicle or to
     * respond to sudden passenger load. Used with TripUpdate.TripProperties.trip_id,
     * TripUpdate.TripProperties.start_date,
     * and TripUpdate.TripProperties.start_time to copy an existing trip from static GTFS but start
     * at a different service
     * date and/or time. Duplicating a trip is allowed if the service related to the original trip
     * in (CSV) GTFS
     * (in calendar.txt or calendar_dates.txt) is operating within the next 30 days. The trip to be
     * duplicated is
     * identified via TripUpdate.TripDescriptor.trip_id. This enumeration does not modify the
     * existing trip referenced by
     * TripUpdate.TripDescriptor.trip_id - if a producer wants to cancel the original trip, it must
     * publish a separate
     * TripUpdate with the value of CANCELED or DELETED. Trips defined in GTFS frequencies.txt with
     * exact_times that is
     * empty or equal to 0 cannot be duplicated. The VehiclePosition.TripDescriptor.trip_id for the
     * new trip must contain
     * the matching value from TripUpdate.TripProperties.trip_id and
     * VehiclePosition.TripDescriptor.ScheduleRelationship
     * must also be set to DUPLICATED.
     * Existing producers and consumers that were using the ADDED enumeration to represent
     * duplicated trips must follow
     * the migration guide
     * (https://github.com/google/transit/tree/master/gtfs-realtime/spec/en/examples/migration-duplicated.md)
     * to transition to the DUPLICATED enumeration.
     * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
     * the future.
     */
    DUPLICATED(6),
    /**
     * A trip that existed in the schedule but was removed and must not be shown to users.
     * DELETED should be used instead of CANCELED to indicate that a transit provider would like to
     * entirely remove
     * information about the corresponding trip from consuming applications, so the trip is not
     * shown as cancelled to
     * riders, e.g. a trip that is entirely being replaced by another trip.
     * This designation becomes particularly important if several trips are cancelled and replaced
     * with substitute service.
     * If consumers were to show explicit information about the cancellations it would distract from
     * the more important
     * real-time predictions.
     * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
     * the future.
     */
    DELETED(7),
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
        1 -> ADDED
        2 -> UNSCHEDULED
        3 -> CANCELED
        5 -> @Suppress("DEPRECATION") REPLACEMENT
        6 -> DUPLICATED
        7 -> DELETED
        else -> null
      }
    }
  }

  public class ModifiedTripSelector(
    /**
     * The 'id' from the FeedEntity in which the contained TripModifications object affects this
     * trip.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      schemaIndex = 0,
    )
    @JvmField
    public val modifications_id: String? = null,
    /**
     * The trip_id from the GTFS feed that is modified by the modifications_id
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      schemaIndex = 1,
    )
    @JvmField
    public val affected_trip_id: String? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<ModifiedTripSelector, ModifiedTripSelector.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.modifications_id = modifications_id
      builder.affected_trip_id = affected_trip_id
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is ModifiedTripSelector) return false
      if (unknownFields != other.unknownFields) return false
      if (modifications_id != other.modifications_id) return false
      if (affected_trip_id != other.affected_trip_id) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (modifications_id?.hashCode() ?: 0)
        result = result * 37 + (affected_trip_id?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (modifications_id != null) result += """modifications_id=${sanitize(modifications_id)}"""
      if (affected_trip_id != null) result += """affected_trip_id=${sanitize(affected_trip_id)}"""
      return result.joinToString(prefix = "ModifiedTripSelector{", separator = ", ", postfix = "}")
    }

    public fun copy(
      modifications_id: String? = this.modifications_id,
      affected_trip_id: String? = this.affected_trip_id,
      unknownFields: ByteString = this.unknownFields,
    ): ModifiedTripSelector = ModifiedTripSelector(modifications_id, affected_trip_id,
        unknownFields)

    public class Builder : Message.Builder<ModifiedTripSelector, Builder>() {
      @JvmField
      public var modifications_id: String? = null

      @JvmField
      public var affected_trip_id: String? = null

      /**
       * The 'id' from the FeedEntity in which the contained TripModifications object affects this
       * trip.
       */
      public fun modifications_id(modifications_id: String?): Builder {
        this.modifications_id = modifications_id
        return this
      }

      /**
       * The trip_id from the GTFS feed that is modified by the modifications_id
       */
      public fun affected_trip_id(affected_trip_id: String?): Builder {
        this.affected_trip_id = affected_trip_id
        return this
      }

      override fun build(): ModifiedTripSelector = ModifiedTripSelector(
        modifications_id = modifications_id,
        affected_trip_id = affected_trip_id,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<ModifiedTripSelector> = object :
          ProtoAdapter<ModifiedTripSelector>(
        FieldEncoding.LENGTH_DELIMITED, 
        ModifiedTripSelector::class, 
        "type.googleapis.com/xyz.ksharma.transport.TripDescriptor.ModifiedTripSelector", 
        PROTO_2, 
        null, 
        "xyz/ksharma/transport/gtfs_realtime.proto"
      ) {
        override fun encodedSize(`value`: ModifiedTripSelector): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.modifications_id)
          size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.affected_trip_id)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: ModifiedTripSelector) {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.modifications_id)
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.affected_trip_id)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: ModifiedTripSelector) {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.affected_trip_id)
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.modifications_id)
        }

        override fun decode(reader: ProtoReader): ModifiedTripSelector {
          var modifications_id: String? = null
          var affected_trip_id: String? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> modifications_id = ProtoAdapter.STRING.decode(reader)
              2 -> affected_trip_id = ProtoAdapter.STRING.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return ModifiedTripSelector(
            modifications_id = modifications_id,
            affected_trip_id = affected_trip_id,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: ModifiedTripSelector): ModifiedTripSelector = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      @JvmSynthetic
      public inline fun build(body: Builder.() -> Unit): ModifiedTripSelector =
          Builder().apply(body).build()
    }
  }
}