// Code generated by Wire protocol buffer compiler, do not edit.
// Source: xyz.ksharma.transport.Shape in xyz/ksharma/transport/gtfs_realtime.proto
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
 * Describes the physical path that a vehicle takes when it's not part of the (CSV) GTFS,
 * such as for a detour. Shapes belong to Trips, and consist of a sequence of shape points.
 * Tracing the points in order provides the path of the vehicle.  Shapes do not need to intercept
 * the location of Stops exactly, but all Stops on a trip should lie within a small distance of
 * the shape for that trip, i.e. close to straight line segments connecting the shape points
 * NOTE: This message is still experimental, and subject to change. It may be formally adopted in
 * the future.
 */
public class Shape(
  /**
   * Identifier of the shape. Must be different than any shape_id defined in the (CSV) GTFS.
   * This field is required as per reference.md, but needs to be specified here optional because
   * "Required is Forever"
   * See https://developers.google.com/protocol-buffers/docs/proto#specifying_field_rules
   * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
   * the future.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val shape_id: String? = null,
  /**
   * Encoded polyline representation of the shape. This polyline must contain at least two points.
   * For more information about encoded polylines, see
   * https://developers.google.com/maps/documentation/utilities/polylinealgorithm
   * This field is required as per reference.md, but needs to be specified here optional because
   * "Required is Forever"
   * See https://developers.google.com/protocol-buffers/docs/proto#specifying_field_rules
   * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
   * the future.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 1,
  )
  @JvmField
  public val encoded_polyline: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Shape, Shape.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.shape_id = shape_id
    builder.encoded_polyline = encoded_polyline
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Shape) return false
    if (unknownFields != other.unknownFields) return false
    if (shape_id != other.shape_id) return false
    if (encoded_polyline != other.encoded_polyline) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (shape_id?.hashCode() ?: 0)
      result = result * 37 + (encoded_polyline?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (shape_id != null) result += """shape_id=${sanitize(shape_id)}"""
    if (encoded_polyline != null) result += """encoded_polyline=${sanitize(encoded_polyline)}"""
    return result.joinToString(prefix = "Shape{", separator = ", ", postfix = "}")
  }

  public fun copy(
    shape_id: String? = this.shape_id,
    encoded_polyline: String? = this.encoded_polyline,
    unknownFields: ByteString = this.unknownFields,
  ): Shape = Shape(shape_id, encoded_polyline, unknownFields)

  public class Builder : Message.Builder<Shape, Builder>() {
    @JvmField
    public var shape_id: String? = null

    @JvmField
    public var encoded_polyline: String? = null

    /**
     * Identifier of the shape. Must be different than any shape_id defined in the (CSV) GTFS.
     * This field is required as per reference.md, but needs to be specified here optional because
     * "Required is Forever"
     * See https://developers.google.com/protocol-buffers/docs/proto#specifying_field_rules
     * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
     * the future.
     */
    public fun shape_id(shape_id: String?): Builder {
      this.shape_id = shape_id
      return this
    }

    /**
     * Encoded polyline representation of the shape. This polyline must contain at least two points.
     * For more information about encoded polylines, see
     * https://developers.google.com/maps/documentation/utilities/polylinealgorithm
     * This field is required as per reference.md, but needs to be specified here optional because
     * "Required is Forever"
     * See https://developers.google.com/protocol-buffers/docs/proto#specifying_field_rules
     * NOTE: This field is still experimental, and subject to change. It may be formally adopted in
     * the future.
     */
    public fun encoded_polyline(encoded_polyline: String?): Builder {
      this.encoded_polyline = encoded_polyline
      return this
    }

    override fun build(): Shape = Shape(
      shape_id = shape_id,
      encoded_polyline = encoded_polyline,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Shape> = object : ProtoAdapter<Shape>(
      FieldEncoding.LENGTH_DELIMITED, 
      Shape::class, 
      "type.googleapis.com/xyz.ksharma.transport.Shape", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: Shape): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.shape_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.encoded_polyline)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Shape) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.shape_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.encoded_polyline)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Shape) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.encoded_polyline)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.shape_id)
      }

      override fun decode(reader: ProtoReader): Shape {
        var shape_id: String? = null
        var encoded_polyline: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> shape_id = ProtoAdapter.STRING.decode(reader)
            2 -> encoded_polyline = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Shape(
          shape_id = shape_id,
          encoded_polyline = encoded_polyline,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Shape): Shape = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): Shape = Builder().apply(body).build()
  }
}