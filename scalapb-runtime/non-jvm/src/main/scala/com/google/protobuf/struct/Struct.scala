// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct

/** `Struct` represents a structured data value, consisting of fields
  * which map to dynamically typed values. In some languages, `Struct`
  * might be supported by a native representation. For example, in
  * scripting languages like JS a struct is represented as an
  * object. The details of that representation are described together
  * with the proto support for the language.
  *
  * The JSON representation for `Struct` is JSON object.
  *
  * @param fields
  *   Unordered map of dynamically typed values.
  */
@SerialVersionUID(0L)
final case class Struct(
    fields: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, com.google.protobuf.struct.Value] = _root_.scala.collection.immutable.Map.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Struct] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      fields.foreach { __item =>
        val __value = com.google.protobuf.struct.Struct._typemapper_fields.toBase(__item)
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
      fields.foreach { __v =>
        val __m = com.google.protobuf.struct.Struct._typemapper_fields.toBase(__v)
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearFields = copy(fields = _root_.scala.collection.immutable.Map.empty)
    def addFields(__vs: (_root_.scala.Predef.String, com.google.protobuf.struct.Value)*): Struct = addAllFields(__vs)
    def addAllFields(__vs: Iterable[(_root_.scala.Predef.String, com.google.protobuf.struct.Value)]): Struct = copy(fields = fields ++ __vs)
    def withFields(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, com.google.protobuf.struct.Value]): Struct = copy(fields = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => fields.iterator.map(com.google.protobuf.struct.Struct._typemapper_fields.toBase).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(fields.iterator.map(com.google.protobuf.struct.Struct._typemapper_fields.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.struct.Struct
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.Struct])
}

object Struct extends scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Struct] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Struct] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Struct = newBuilder.merge(input).result()
  def merge(`_message__`: com.google.protobuf.struct.Struct, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Struct = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.struct.Struct] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.struct.Struct(
        fields = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.protobuf.struct.Struct.FieldsEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(com.google.protobuf.struct.Struct._typemapper_fields.toCustom).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = StructProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = StructProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.struct.Struct.FieldsEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.struct.Struct.FieldsEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.struct.Struct(
    fields = _root_.scala.collection.immutable.Map.empty
  )
  final class Builder private (
    private var __fields: collection.mutable.Builder[(_root_.scala.Predef.String, com.google.protobuf.struct.Value), _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, com.google.protobuf.struct.Value]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.struct.Struct] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fields += com.google.protobuf.struct.Struct._typemapper_fields.toCustom(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Struct.FieldsEntry](_input__))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.struct.Struct = {
      com.google.protobuf.struct.Struct(
        fields = __fields.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.struct.Struct, com.google.protobuf.struct.Struct.Builder] {
    def apply(): Builder = new Builder(
      __fields = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, com.google.protobuf.struct.Value],
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.struct.Struct): Builder = new Builder(
      __fields = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, com.google.protobuf.struct.Value] ++= _message__.fields,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.struct.Struct.Builder()
  def newBuilder(`_message__`: com.google.protobuf.struct.Struct): Builder = com.google.protobuf.struct.Struct.Builder(_message__)
  @SerialVersionUID(0L)
  final case class FieldsEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Option[com.google.protobuf.struct.Value] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FieldsEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        if (value.isDefined) {
          val __value = value.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
          val __v = key
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          val __m = __v
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        unknownFields.writeTo(_output__)
      }
      def withKey(__v: _root_.scala.Predef.String): FieldsEntry = copy(key = __v)
      def getValue: com.google.protobuf.struct.Value = value.getOrElse(com.google.protobuf.struct.Value.defaultInstance)
      def clearValue: FieldsEntry = copy(value = _root_.scala.None)
      def withValue(__v: com.google.protobuf.struct.Value): FieldsEntry = copy(value = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.struct.Struct.FieldsEntry
      // @@protoc_insertion_point(GeneratedMessage[google.protobuf.Struct.FieldsEntry])
  }
  
  object FieldsEntry extends scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Struct.FieldsEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Struct.FieldsEntry] = this
    override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Struct.FieldsEntry = newBuilder.merge(input).result()
    def merge(`_message__`: com.google.protobuf.struct.Struct.FieldsEntry, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Struct.FieldsEntry = newBuilder(_message__).merge(_input__).result()
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.struct.Struct.FieldsEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.struct.Struct.FieldsEntry(
          key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Value]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.struct.Struct.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.struct.Struct.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = com.google.protobuf.struct.Value
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.struct.Struct.FieldsEntry(
      key = "",
      value = _root_.scala.None
    )
    final class Builder private (
      private var __key: _root_.scala.Predef.String,
      private var __value: _root_.scala.Option[com.google.protobuf.struct.Value],
      private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
    ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.struct.Struct.FieldsEntry] {
      def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readStringRequireUtf8()
            case 18 =>
              __value = Option(__value.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.struct.Value](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
            case tag =>
              if (_unknownFields__ == null) {
                _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
              }
              _unknownFields__.parseField(tag, _input__)
          }
        }
        this
      }
      def result(): com.google.protobuf.struct.Struct.FieldsEntry = {
        com.google.protobuf.struct.Struct.FieldsEntry(
          key = __key,
          value = __value,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
        )
      }
    }
    object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.struct.Struct.FieldsEntry, com.google.protobuf.struct.Struct.FieldsEntry.Builder] {
      def apply(): Builder = new Builder(
        __key = "",
        __value = _root_.scala.None,
        `_unknownFields__` = null
      )
      def apply(`_message__`: com.google.protobuf.struct.Struct.FieldsEntry): Builder = new Builder(
        __key = _message__.key,
        __value = _message__.value,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
      )
    }
    def newBuilder: Builder = com.google.protobuf.struct.Struct.FieldsEntry.Builder()
    def newBuilder(`_message__`: com.google.protobuf.struct.Struct.FieldsEntry): Builder = com.google.protobuf.struct.Struct.FieldsEntry.Builder(_message__)
    implicit class FieldsEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct.FieldsEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.struct.Struct.FieldsEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Value] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Value]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    @transient
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.google.protobuf.struct.Struct.FieldsEntry, (_root_.scala.Predef.String, com.google.protobuf.struct.Value)] =
      _root_.scalapb.TypeMapper[com.google.protobuf.struct.Struct.FieldsEntry, (_root_.scala.Predef.String, com.google.protobuf.struct.Value)](__m => (__m.key, __m.getValue))(__p => com.google.protobuf.struct.Struct.FieldsEntry(__p._1, Some(__p._2)))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Option[com.google.protobuf.struct.Value]
    ): _root_.com.google.protobuf.struct.Struct.FieldsEntry = _root_.com.google.protobuf.struct.Struct.FieldsEntry(
      key,
      value
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.Struct.FieldsEntry])
  }
  
  implicit class StructLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.struct.Struct](_l) {
    def fields: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, com.google.protobuf.struct.Value]] = field(_.fields)((c_, f_) => c_.copy(fields = f_))
  }
  final val FIELDS_FIELD_NUMBER = 1
  @transient
  private[struct] val _typemapper_fields: _root_.scalapb.TypeMapper[com.google.protobuf.struct.Struct.FieldsEntry, (_root_.scala.Predef.String, com.google.protobuf.struct.Value)] = implicitly[_root_.scalapb.TypeMapper[com.google.protobuf.struct.Struct.FieldsEntry, (_root_.scala.Predef.String, com.google.protobuf.struct.Value)]]
  def of(
    fields: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, com.google.protobuf.struct.Value]
  ): _root_.com.google.protobuf.struct.Struct = _root_.com.google.protobuf.struct.Struct(
    fields
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.Struct])
}
