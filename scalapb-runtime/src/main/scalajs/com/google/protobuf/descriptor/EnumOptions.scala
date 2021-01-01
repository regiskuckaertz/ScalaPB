// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** @param allowAlias
  *   Set this option to true to allow mapping different tag names to the same
  *   value.
  * @param deprecated
  *   Is this enum deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the enum, or it will be completely ignored; in the very least, this
  *   is a formalization for deprecating enums.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class EnumOptions(
    allowAlias: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EnumOptions] with _root_.scalapb.ExtendableMessage[EnumOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (allowAlias.isDefined) {
        val __value = allowAlias.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
      };
      uninterpretedOption.foreach { __item =>
        val __value = __item
        __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      allowAlias.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(3, __m)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getAllowAlias: _root_.scala.Boolean = allowAlias.getOrElse(false)
    def clearAllowAlias: EnumOptions = copy(allowAlias = _root_.scala.None)
    def withAllowAlias(__v: _root_.scala.Boolean): EnumOptions = copy(allowAlias = Option(__v))
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: EnumOptions = copy(deprecated = _root_.scala.None)
    def withDeprecated(__v: _root_.scala.Boolean): EnumOptions = copy(deprecated = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): EnumOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[com.google.protobuf.descriptor.UninterpretedOption]): EnumOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]): EnumOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => allowAlias.orNull
        case 3 => deprecated.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 2 => allowAlias.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumOptions
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.EnumOptions])
}

object EnumOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumOptions] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumOptions = newBuilder.merge(input).result()
  def merge(`_message__`: com.google.protobuf.descriptor.EnumOptions, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumOptions = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.EnumOptions(
        allowAlias = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        deprecated = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        uninterpretedOption = __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(14)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(14)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumOptions(
    allowAlias = _root_.scala.None,
    deprecated = _root_.scala.None,
    uninterpretedOption = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __allowAlias: _root_.scala.Option[_root_.scala.Boolean],
    private var __deprecated: _root_.scala.Option[_root_.scala.Boolean],
    private var __uninterpretedOption: collection.mutable.Builder[com.google.protobuf.descriptor.UninterpretedOption, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.descriptor.EnumOptions] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 16 =>
            __allowAlias = Option(_input__.readBool())
          case 24 =>
            __deprecated = Option(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.UninterpretedOption](_input__)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.descriptor.EnumOptions = {
      com.google.protobuf.descriptor.EnumOptions(
          allowAlias = __allowAlias,
          deprecated = __deprecated,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.descriptor.EnumOptions, com.google.protobuf.descriptor.EnumOptions.Builder] {
    def apply(): Builder = new Builder(
      __allowAlias = _root_.scala.None,
      __deprecated = _root_.scala.None,
      __uninterpretedOption = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption],
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.descriptor.EnumOptions): Builder = new Builder(
      __allowAlias = _message__.allowAlias,
      __deprecated = _message__.deprecated,
      __uninterpretedOption = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= _message__.uninterpretedOption,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.descriptor.EnumOptions.Builder()
  def newBuilder(`_message__`: com.google.protobuf.descriptor.EnumOptions): Builder = com.google.protobuf.descriptor.EnumOptions.Builder(_message__)
  implicit class EnumOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumOptions](_l) {
    def allowAlias: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getAllowAlias)((c_, f_) => c_.copy(allowAlias = Option(f_)))
    def optionalAllowAlias: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.allowAlias)((c_, f_) => c_.copy(allowAlias = f_))
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val ALLOW_ALIAS_FIELD_NUMBER = 2
  final val DEPRECATED_FIELD_NUMBER = 3
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    allowAlias: _root_.scala.Option[_root_.scala.Boolean],
    deprecated: _root_.scala.Option[_root_.scala.Boolean],
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]
  ): _root_.com.google.protobuf.descriptor.EnumOptions = _root_.com.google.protobuf.descriptor.EnumOptions(
    allowAlias,
    deprecated,
    uninterpretedOption
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.EnumOptions])
}
