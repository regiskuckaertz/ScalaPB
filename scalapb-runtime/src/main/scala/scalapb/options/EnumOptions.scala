// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param extends
  *   Additional classes and traits to mix in to the base trait
  * @param companionExtends
  *   Additional classes and traits to mix in to the companion object.
  * @param type
  *   All instances of this enum will be converted to this type. An implicit TypeMapper
  *   must be present.
  */
@SerialVersionUID(0L)
final case class EnumOptions(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EnumOptions] with _root_.scalapb.ExtendableMessage[EnumOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      `extends`.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      companionExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
      `extends`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      companionExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearExtends = copy(`extends` = _root_.scala.Seq.empty)
    def addExtends(__vs: _root_.scala.Predef.String*): EnumOptions = addAllExtends(__vs)
    def addAllExtends(__vs: Iterable[_root_.scala.Predef.String]): EnumOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): EnumOptions = copy(`extends` = __v)
    def clearCompanionExtends = copy(companionExtends = _root_.scala.Seq.empty)
    def addCompanionExtends(__vs: _root_.scala.Predef.String*): EnumOptions = addAllCompanionExtends(__vs)
    def addAllCompanionExtends(__vs: Iterable[_root_.scala.Predef.String]): EnumOptions = copy(companionExtends = companionExtends ++ __vs)
    def withCompanionExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): EnumOptions = copy(companionExtends = __v)
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: EnumOptions = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): EnumOptions = copy(`type` = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
        case 2 => companionExtends
        case 3 => `type`.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 2 => _root_.scalapb.descriptors.PRepeated(companionExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 3 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.EnumOptions
    // @@protoc_insertion_point(GeneratedMessage[scalapb.EnumOptions])
}

object EnumOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.EnumOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.EnumOptions] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): scalapb.options.EnumOptions = newBuilder.merge(input).result()
  def merge(`_message__`: scalapb.options.EnumOptions, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.EnumOptions = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.EnumOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.EnumOptions(
        `extends` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        companionExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes().get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.EnumOptions(
    `extends` = _root_.scala.Seq.empty,
    companionExtends = _root_.scala.Seq.empty,
    `type` = _root_.scala.None
  )
  final class Builder private (
    private var __extends: collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __companionExtends: collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __type: _root_.scala.Option[_root_.scala.Predef.String],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.options.EnumOptions] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readStringRequireUtf8()
          case 18 =>
            __companionExtends += _input__.readStringRequireUtf8()
          case 26 =>
            __type = Option(_input__.readStringRequireUtf8())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.options.EnumOptions = {
      scalapb.options.EnumOptions(
          `extends` = __extends.result(),
          companionExtends = __companionExtends.result(),
          `type` = __type,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.options.EnumOptions, scalapb.options.EnumOptions.Builder] {
    def apply(): Builder = new Builder(
      __extends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __companionExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __type = _root_.scala.None,
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.options.EnumOptions): Builder = new Builder(
      __extends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.`extends`,
      __companionExtends = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.companionExtends,
      __type = _message__.`type`,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.options.EnumOptions.Builder()
  def newBuilder(`_message__`: scalapb.options.EnumOptions): Builder = scalapb.options.EnumOptions.Builder(_message__)
  implicit class EnumOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.EnumOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.EnumOptions](_l) {
    def `extends`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
    def companionExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.companionExtends)((c_, f_) => c_.copy(companionExtends = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  final val COMPANION_EXTENDS_FIELD_NUMBER = 2
  final val TYPE_FIELD_NUMBER = 3
  def of(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String],
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    `type`: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.scalapb.options.EnumOptions = _root_.scalapb.options.EnumOptions(
    `extends`,
    companionExtends,
    `type`
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.EnumOptions])
}
