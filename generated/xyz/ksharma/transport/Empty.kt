// Code generated by Wire protocol buffer compiler, do not edit.
// Source: xyz.ksharma.transport.Empty in xyz/ksharma/transport/transport_service.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.transport

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okio.ByteString

public class Empty(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Empty, Empty.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Empty) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "Empty{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): Empty = Empty(unknownFields)

  public class Builder : Message.Builder<Empty, Builder>() {
    override fun build(): Empty = Empty(
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Empty> = object : ProtoAdapter<Empty>(
      FieldEncoding.LENGTH_DELIMITED, 
      Empty::class, 
      "type.googleapis.com/xyz.ksharma.transport.Empty", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/transport_service.proto"
    ) {
      override fun encodedSize(`value`: Empty): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Empty) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Empty) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): Empty {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return Empty(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Empty): Empty = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): Empty = Builder().apply(body).build()
  }
}
