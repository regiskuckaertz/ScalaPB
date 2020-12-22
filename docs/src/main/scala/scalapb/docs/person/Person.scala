// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.docs.person

@SerialVersionUID(0L)
final case class Person(
    name: _root_.scala.Predef.String = "",
    age: _root_.scala.Int = 0,
    addresses: _root_.scala.Seq[scalapb.docs.person.Person.Address] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Person] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = age
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      addresses.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = age
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      addresses.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Person = copy(name = __v)
    def withAge(__v: _root_.scala.Int): Person = copy(age = __v)
    def clearAddresses = copy(addresses = _root_.scala.Seq.empty)
    def addAddresses(__vs: scalapb.docs.person.Person.Address*): Person = addAllAddresses(__vs)
    def addAllAddresses(__vs: Iterable[scalapb.docs.person.Person.Address]): Person = copy(addresses = addresses ++ __vs)
    def withAddresses(__v: _root_.scala.Seq[scalapb.docs.person.Person.Address]): Person = copy(addresses = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = age
          if (__t != 0) __t else null
        }
        case 3 => addresses
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PInt(age)
        case 3 => _root_.scalapb.descriptors.PRepeated(addresses.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.docs.person.Person
}

object Person extends scalapb.GeneratedMessageCompanion[scalapb.docs.person.Person] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.docs.person.Person] = this
  override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): scalapb.docs.person.Person = newBuilder.merge(input).result()
  def merge(`_message__`: scalapb.docs.person.Person, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.docs.person.Person = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.docs.person.Person] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.docs.person.Person(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        age = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        addresses = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[scalapb.docs.person.Person.Address]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PersonProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PersonProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = scalapb.docs.person.Person.Address
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.scalapb.docs.person.Person.Address
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.docs.person.Person(
    name = "",
    age = 0,
    addresses = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __name: _root_.scala.Predef.String,
    private var __age: _root_.scala.Int,
    private var __addresses: collection.mutable.Builder[scalapb.docs.person.Person.Address, _root_.scala.Seq[scalapb.docs.person.Person.Address]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.docs.person.Person] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readStringRequireUtf8()
          case 16 =>
            __age = _input__.readInt32()
          case 26 =>
            __addresses += _root_.scalapb.LiteParser.readMessage(_input__, scalapb.docs.person.Person.Address.defaultInstance)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.docs.person.Person = {
      scalapb.docs.person.Person(
          name = __name,
          age = __age,
          addresses = __addresses.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.docs.person.Person, scalapb.docs.person.Person.Builder] {
    def apply(): Builder = new Builder(
      __name = "",
      __age = 0,
      __addresses = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.docs.person.Person.Address],
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.docs.person.Person): Builder = new Builder(
      __name = _message__.name,
      __age = _message__.age,
      __addresses = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.docs.person.Person.Address] ++= _message__.addresses,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.docs.person.Person.Builder()
  def newBuilder(a: scalapb.docs.person.Person): Builder = scalapb.docs.person.Person.Builder(a)
  sealed abstract class AddressType(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = AddressType
    def isHome: _root_.scala.Boolean = false
    def isWork: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[AddressType] = scalapb.docs.person.Person.AddressType
    final def asRecognized: _root_.scala.Option[scalapb.docs.person.Person.AddressType.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[scalapb.docs.person.Person.AddressType.Recognized])
  }
  
  object AddressType extends _root_.scalapb.GeneratedEnumCompanion[AddressType] {
    sealed trait Recognized extends AddressType
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[AddressType] = this
    @SerialVersionUID(0L)
    case object HOME extends AddressType(0) with AddressType.Recognized {
      val index = 0
      val name = "HOME"
      override def isHome: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object WORK extends AddressType(1) with AddressType.Recognized {
      val index = 1
      val name = "WORK"
      override def isWork: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends AddressType(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(HOME, WORK)
    def fromValue(__value: _root_.scala.Int): AddressType = __value match {
      case 0 => HOME
      case 1 => WORK
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = scalapb.docs.person.Person.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = scalapb.docs.person.Person.scalaDescriptor.enums(0)
  }
  @SerialVersionUID(0L)
  final case class Address(
      addressType: scalapb.docs.person.Person.AddressType = scalapb.docs.person.Person.AddressType.HOME,
      street: _root_.scala.Predef.String = "",
      city: _root_.scala.Predef.String = "",
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Address] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = addressType.value
          if (__value != 0) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value)
          }
        };
        
        {
          val __value = street
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        
        {
          val __value = city
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
          }
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        {
          val __v = addressType.value
          if (__v != 0) {
            _output__.writeEnum(1, __v)
          }
        };
        {
          val __v = street
          if (!__v.isEmpty) {
            _output__.writeString(2, __v)
          }
        };
        {
          val __v = city
          if (!__v.isEmpty) {
            _output__.writeString(3, __v)
          }
        };
        unknownFields.writeTo(_output__)
      }
      def withAddressType(__v: scalapb.docs.person.Person.AddressType): Address = copy(addressType = __v)
      def withStreet(__v: _root_.scala.Predef.String): Address = copy(street = __v)
      def withCity(__v: _root_.scala.Predef.String): Address = copy(city = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = addressType.javaValueDescriptor
            if (__t.getNumber() != 0) __t else null
          }
          case 2 => {
            val __t = street
            if (__t != "") __t else null
          }
          case 3 => {
            val __t = city
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PEnum(addressType.scalaValueDescriptor)
          case 2 => _root_.scalapb.descriptors.PString(street)
          case 3 => _root_.scalapb.descriptors.PString(city)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = scalapb.docs.person.Person.Address
  }
  
  object Address extends scalapb.GeneratedMessageCompanion[scalapb.docs.person.Person.Address] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.docs.person.Person.Address] = this
    override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): scalapb.docs.person.Person.Address = newBuilder.merge(input).result()
    def merge(`_message__`: scalapb.docs.person.Person.Address, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.docs.person.Person.Address = newBuilder(_message__).merge(_input__).result()
    implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.docs.person.Person.Address] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        scalapb.docs.person.Person.Address(
          addressType = scalapb.docs.person.Person.AddressType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(scalapb.docs.person.Person.AddressType.HOME.scalaValueDescriptor).number),
          street = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          city = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = scalapb.docs.person.Person.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = scalapb.docs.person.Person.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => scalapb.docs.person.Person.AddressType
      }
    }
    lazy val defaultInstance = scalapb.docs.person.Person.Address(
      addressType = scalapb.docs.person.Person.AddressType.HOME,
      street = "",
      city = ""
    )
    final class Builder private (
      private var __addressType: scalapb.docs.person.Person.AddressType,
      private var __street: _root_.scala.Predef.String,
      private var __city: _root_.scala.Predef.String,
      private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
    ) extends _root_.scalapb.MessageBuilder[scalapb.docs.person.Person.Address] {
      def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __addressType = scalapb.docs.person.Person.AddressType.fromValue(_input__.readEnum())
            case 18 =>
              __street = _input__.readStringRequireUtf8()
            case 26 =>
              __city = _input__.readStringRequireUtf8()
            case tag =>
              if (_unknownFields__ == null) {
                _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
              }
              _unknownFields__.parseField(tag, _input__)
          }
        }
        this
      }
      def result(): scalapb.docs.person.Person.Address = {
        scalapb.docs.person.Person.Address(
            addressType = __addressType,
            street = __street,
            city = __city,
            unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
        )
      }
    }
    object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.docs.person.Person.Address, scalapb.docs.person.Person.Address.Builder] {
      def apply(): Builder = new Builder(
        __addressType = scalapb.docs.person.Person.AddressType.HOME,
        __street = "",
        __city = "",
        `_unknownFields__` = null
      )
      def apply(`_message__`: scalapb.docs.person.Person.Address): Builder = new Builder(
        __addressType = _message__.addressType,
        __street = _message__.street,
        __city = _message__.city,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
      )
    }
    def newBuilder: Builder = scalapb.docs.person.Person.Address.Builder()
    def newBuilder(a: scalapb.docs.person.Person.Address): Builder = scalapb.docs.person.Person.Address.Builder(a)
    implicit class AddressLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.docs.person.Person.Address]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.docs.person.Person.Address](_l) {
      def addressType: _root_.scalapb.lenses.Lens[UpperPB, scalapb.docs.person.Person.AddressType] = field(_.addressType)((c_, f_) => c_.copy(addressType = f_))
      def street: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.street)((c_, f_) => c_.copy(street = f_))
      def city: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.city)((c_, f_) => c_.copy(city = f_))
    }
    final val ADDRESS_TYPE_FIELD_NUMBER = 1
    final val STREET_FIELD_NUMBER = 2
    final val CITY_FIELD_NUMBER = 3
    def of(
      addressType: scalapb.docs.person.Person.AddressType,
      street: _root_.scala.Predef.String,
      city: _root_.scala.Predef.String
    ): _root_.scalapb.docs.person.Person.Address = _root_.scalapb.docs.person.Person.Address(
      addressType,
      street,
      city
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.docs.Person.Address])
  }
  
  implicit class PersonLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.docs.person.Person]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.docs.person.Person](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def age: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.age)((c_, f_) => c_.copy(age = f_))
    def addresses: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[scalapb.docs.person.Person.Address]] = field(_.addresses)((c_, f_) => c_.copy(addresses = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val AGE_FIELD_NUMBER = 2
  final val ADDRESSES_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Predef.String,
    age: _root_.scala.Int,
    addresses: _root_.scala.Seq[scalapb.docs.person.Person.Address]
  ): _root_.scalapb.docs.person.Person = _root_.scalapb.docs.person.Person(
    name,
    age,
    addresses
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.docs.Person])
}
