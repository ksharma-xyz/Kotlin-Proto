// Code generated by Wire protocol buffer compiler, do not edit.
// Source: powerpuff.PowerpuffGirl in xyz/ksharma/powerpuff/powerpuff.proto
@file:Suppress("DEPRECATION")

package powerpuff

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
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

public class PowerpuffGirl(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  @JvmField
  public val id: Int = 0,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  @JvmField
  public val name: String = "",
  abilities: List<Ability> = emptyList(),
  @field:WireField(
    tag = 4,
    adapter = "powerpuff.PowerpuffGirl${'$'}Type#ADAPTER",
    schemaIndex = 3,
  )
  @JvmField
  public val type: Type? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<PowerpuffGirl, PowerpuffGirl.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 3,
    adapter = "powerpuff.PowerpuffGirl${'$'}Ability#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 2,
  )
  @JvmField
  public val abilities: List<Ability> = immutableCopyOf("abilities", abilities)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.id = id
    builder.name = name
    builder.abilities = abilities
    builder.type = type
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is PowerpuffGirl) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (name != other.name) return false
    if (abilities != other.abilities) return false
    if (type != other.type) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + id.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + abilities.hashCode()
      result = result * 37 + (type?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """id=$id"""
    result += """name=${sanitize(name)}"""
    if (abilities.isNotEmpty()) result += """abilities=$abilities"""
    if (type != null) result += """type=$type"""
    return result.joinToString(prefix = "PowerpuffGirl{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: Int = this.id,
    name: String = this.name,
    abilities: List<Ability> = this.abilities,
    type: Type? = this.type,
    unknownFields: ByteString = this.unknownFields,
  ): PowerpuffGirl = PowerpuffGirl(id, name, abilities, type, unknownFields)

  public class Builder : Message.Builder<PowerpuffGirl, Builder>() {
    @JvmField
    public var id: Int = 0

    @JvmField
    public var name: String = ""

    @JvmField
    public var abilities: List<Ability> = emptyList()

    @JvmField
    public var type: Type? = null

    public fun id(id: Int): Builder {
      this.id = id
      return this
    }

    public fun name(name: String): Builder {
      this.name = name
      return this
    }

    public fun abilities(abilities: List<Ability>): Builder {
      checkElementsNotNull(abilities)
      this.abilities = abilities
      return this
    }

    public fun type(type: Type?): Builder {
      this.type = type
      return this
    }

    override fun build(): PowerpuffGirl = PowerpuffGirl(
      id = id,
      name = name,
      abilities = abilities,
      type = type,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<PowerpuffGirl> = object : ProtoAdapter<PowerpuffGirl>(
      FieldEncoding.LENGTH_DELIMITED, 
      PowerpuffGirl::class, 
      "type.googleapis.com/powerpuff.PowerpuffGirl", 
      PROTO_3, 
      null, 
      "xyz/ksharma/powerpuff/powerpuff.proto"
    ) {
      override fun encodedSize(`value`: PowerpuffGirl): Int {
        var size = value.unknownFields.size
        if (value.id != 0) {
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.id)
        }
        if (value.name != "") {
          size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.name)
        }
        size += Ability.ADAPTER.asRepeated().encodedSizeWithTag(3, value.abilities)
        size += Type.ADAPTER.encodedSizeWithTag(4, value.type)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: PowerpuffGirl) {
        if (value.id != 0) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.id)
        }
        if (value.name != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name)
        }
        Ability.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.abilities)
        Type.ADAPTER.encodeWithTag(writer, 4, value.type)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: PowerpuffGirl) {
        writer.writeBytes(value.unknownFields)
        Type.ADAPTER.encodeWithTag(writer, 4, value.type)
        Ability.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.abilities)
        if (value.name != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name)
        }
        if (value.id != 0) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.id)
        }
      }

      override fun decode(reader: ProtoReader): PowerpuffGirl {
        var id: Int = 0
        var name: String = ""
        val abilities = mutableListOf<Ability>()
        var type: Type? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> id = ProtoAdapter.INT32.decode(reader)
            2 -> name = ProtoAdapter.STRING.decode(reader)
            3 -> try {
              Ability.ADAPTER.tryDecode(reader, abilities)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            4 -> try {
              type = Type.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return PowerpuffGirl(
          id = id,
          name = name,
          abilities = abilities,
          type = type,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: PowerpuffGirl): PowerpuffGirl = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): PowerpuffGirl = Builder().apply(body).build()
  }

  public enum class Ability(
    override val `value`: Int,
  ) : WireEnum {
    UNKNOWN(0),
    SUPER_STRENGTH(1),
    FLIGHT(2),
    HEAT_VISION(3),
    SPEED(4),
    INVISIBILITY(5),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<Ability> = object : EnumAdapter<Ability>(
        Ability::class, 
        PROTO_3, 
        Ability.UNKNOWN
      ) {
        override fun fromValue(`value`: Int): Ability? = Ability.fromValue(`value`)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): Ability? = when (`value`) {
        0 -> UNKNOWN
        1 -> SUPER_STRENGTH
        2 -> FLIGHT
        3 -> HEAT_VISION
        4 -> SPEED
        5 -> INVISIBILITY
        else -> null
      }
    }
  }

  public enum class Type(
    override val `value`: Int,
  ) : WireEnum {
    BUBBLE(0),
    BLOSSOM(1),
    BUTTERCUP(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<Type> = object : EnumAdapter<Type>(
        Type::class, 
        PROTO_3, 
        Type.BUBBLE
      ) {
        override fun fromValue(`value`: Int): Type? = Type.fromValue(`value`)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): Type? = when (`value`) {
        0 -> BUBBLE
        1 -> BLOSSOM
        2 -> BUTTERCUP
        else -> null
      }
    }
  }
}
