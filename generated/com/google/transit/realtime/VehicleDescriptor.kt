// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.VehicleDescriptor in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package com.google.transit.realtime

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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okio.ByteString

/**
 * Identification information for the vehicle performing the trip.
 */
public class VehicleDescriptor(
  /**
   * Internal system identification of the vehicle. Should be unique per
   * vehicle, and can be used for tracking the vehicle as it proceeds through
   * the system.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val id: String? = null,
  /**
   * User visible label, i.e., something that must be shown to the passenger to
   * help identify the correct vehicle.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 1,
  )
  @JvmField
  public val label: String? = null,
  /**
   * The license plate of the vehicle.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  @JvmField
  public val license_plate: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.google.transit.realtime.VehicleDescriptor${'$'}WheelchairAccessible#ADAPTER",
    schemaIndex = 3,
  )
  @JvmField
  public val wheelchair_accessible: WheelchairAccessible? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<VehicleDescriptor, VehicleDescriptor.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.id = id
    builder.label = label
    builder.license_plate = license_plate
    builder.wheelchair_accessible = wheelchair_accessible
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is VehicleDescriptor) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (label != other.label) return false
    if (license_plate != other.license_plate) return false
    if (wheelchair_accessible != other.wheelchair_accessible) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (id?.hashCode() ?: 0)
      result = result * 37 + (label?.hashCode() ?: 0)
      result = result * 37 + (license_plate?.hashCode() ?: 0)
      result = result * 37 + (wheelchair_accessible?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (id != null) result += """id=${sanitize(id)}"""
    if (label != null) result += """label=${sanitize(label)}"""
    if (license_plate != null) result += """license_plate=${sanitize(license_plate)}"""
    if (wheelchair_accessible != null) result += """wheelchair_accessible=$wheelchair_accessible"""
    return result.joinToString(prefix = "VehicleDescriptor{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: String? = this.id,
    label: String? = this.label,
    license_plate: String? = this.license_plate,
    wheelchair_accessible: WheelchairAccessible? = this.wheelchair_accessible,
    unknownFields: ByteString = this.unknownFields,
  ): VehicleDescriptor = VehicleDescriptor(id, label, license_plate, wheelchair_accessible,
      unknownFields)

  public class Builder : Message.Builder<VehicleDescriptor, Builder>() {
    @JvmField
    public var id: String? = null

    @JvmField
    public var label: String? = null

    @JvmField
    public var license_plate: String? = null

    @JvmField
    public var wheelchair_accessible: WheelchairAccessible? = null

    /**
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     */
    public fun id(id: String?): Builder {
      this.id = id
      return this
    }

    /**
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     */
    public fun label(label: String?): Builder {
      this.label = label
      return this
    }

    /**
     * The license plate of the vehicle.
     */
    public fun license_plate(license_plate: String?): Builder {
      this.license_plate = license_plate
      return this
    }

    public fun wheelchair_accessible(wheelchair_accessible: WheelchairAccessible?): Builder {
      this.wheelchair_accessible = wheelchair_accessible
      return this
    }

    override fun build(): VehicleDescriptor = VehicleDescriptor(
      id = id,
      label = label,
      license_plate = license_plate,
      wheelchair_accessible = wheelchair_accessible,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val DEFAULT_WHEELCHAIR_ACCESSIBLE: WheelchairAccessible = WheelchairAccessible.NO_VALUE

    @JvmField
    public val ADAPTER: ProtoAdapter<VehicleDescriptor> = object : ProtoAdapter<VehicleDescriptor>(
      FieldEncoding.LENGTH_DELIMITED, 
      VehicleDescriptor::class, 
      "type.googleapis.com/transit_realtime.VehicleDescriptor", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: VehicleDescriptor): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.label)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.license_plate)
        size += WheelchairAccessible.ADAPTER.encodedSizeWithTag(4, value.wheelchair_accessible)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: VehicleDescriptor) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.license_plate)
        WheelchairAccessible.ADAPTER.encodeWithTag(writer, 4, value.wheelchair_accessible)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: VehicleDescriptor) {
        writer.writeBytes(value.unknownFields)
        WheelchairAccessible.ADAPTER.encodeWithTag(writer, 4, value.wheelchair_accessible)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.license_plate)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
      }

      override fun decode(reader: ProtoReader): VehicleDescriptor {
        var id: String? = null
        var label: String? = null
        var license_plate: String? = null
        var wheelchair_accessible: WheelchairAccessible? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> id = ProtoAdapter.STRING.decode(reader)
            2 -> label = ProtoAdapter.STRING.decode(reader)
            3 -> license_plate = ProtoAdapter.STRING.decode(reader)
            4 -> try {
              wheelchair_accessible = WheelchairAccessible.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return VehicleDescriptor(
          id = id,
          label = label,
          license_plate = license_plate,
          wheelchair_accessible = wheelchair_accessible,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: VehicleDescriptor): VehicleDescriptor = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): VehicleDescriptor =
        Builder().apply(body).build()
  }

  public enum class WheelchairAccessible(
    override val `value`: Int,
  ) : WireEnum {
    /**
     * The trip doesn't have information about wheelchair accessibility.
     * This is the **default** behavior. If the static GTFS contains a
     * _wheelchair_accessible_ value, it won't be overwritten.
     */
    NO_VALUE(0),
    /**
     * The trip has no accessibility value present.
     * This value will overwrite the value from the GTFS.
     */
    UNKNOWN(1),
    /**
     * The trip is wheelchair accessible.
     * This value will overwrite the value from the GTFS.
     */
    WHEELCHAIR_ACCESSIBLE(2),
    /**
     * The trip is **not** wheelchair accessible.
     * This value will overwrite the value from the GTFS.
     */
    WHEELCHAIR_INACCESSIBLE(3),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<WheelchairAccessible> = object :
          EnumAdapter<WheelchairAccessible>(
        WheelchairAccessible::class, 
        PROTO_2, 
        WheelchairAccessible.NO_VALUE
      ) {
        override fun fromValue(`value`: Int): WheelchairAccessible? =
            WheelchairAccessible.fromValue(`value`)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): WheelchairAccessible? = when (`value`) {
        0 -> NO_VALUE
        1 -> UNKNOWN
        2 -> WHEELCHAIR_ACCESSIBLE
        3 -> WHEELCHAIR_INACCESSIBLE
        else -> null
      }
    }
  }
}
