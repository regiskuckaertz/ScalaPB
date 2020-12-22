// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor
import _root_.scalapb.internal.compat.JavaConverters._

/** @param deprecated
  *   Is this method deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the method, or it will be completely ignored; in the very least,
  *   this is a formalization for deprecating methods.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class MethodOptions(
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    idempotencyLevel: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = _root_.scala.None,
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MethodOptions] with _root_.scalapb.ExtendableMessage[MethodOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(33, __value)
      };
      if (idempotencyLevel.isDefined) {
        val __value = idempotencyLevel.get.value
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(34, __value)
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
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(33, __m)
      };
      idempotencyLevel.foreach { __v =>
        val __m = __v.value
        _output__.writeEnum(34, __m)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MethodOptions = copy(deprecated = _root_.scala.None)
    def withDeprecated(__v: _root_.scala.Boolean): MethodOptions = copy(deprecated = Option(__v))
    def getIdempotencyLevel: com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel = idempotencyLevel.getOrElse(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN)
    def clearIdempotencyLevel: MethodOptions = copy(idempotencyLevel = _root_.scala.None)
    def withIdempotencyLevel(__v: com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel): MethodOptions = copy(idempotencyLevel = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): MethodOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 33 => deprecated.orNull
        case 34 => idempotencyLevel.map(_.javaValueDescriptor).orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 33 => deprecated.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 34 => idempotencyLevel.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MethodOptions
}

object MethodOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodOptions, com.google.protobuf.DescriptorProtos.MethodOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodOptions, com.google.protobuf.DescriptorProtos.MethodOptions] = this
  override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodOptions = newBuilder.merge(input).result()
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MethodOptions): com.google.protobuf.DescriptorProtos.MethodOptions = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder
    scalaPbSource.deprecated.foreach(javaPbOut.setDeprecated)
    scalaPbSource.idempotencyLevel.map(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.toJavaValue).foreach(javaPbOut.setIdempotencyLevel)
    javaPbOut.addAllUninterpretedOption(_root_.scalapb.internal.compat.toIterable(scalaPbSource.uninterpretedOption.iterator.map(com.google.protobuf.descriptor.UninterpretedOption.toJavaProto)).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MethodOptions): com.google.protobuf.descriptor.MethodOptions = com.google.protobuf.descriptor.MethodOptions(
    deprecated = if (javaPbSource.hasDeprecated) Some(javaPbSource.getDeprecated.booleanValue) else _root_.scala.None,
    idempotencyLevel = if (javaPbSource.hasIdempotencyLevel) Some(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromJavaValue(javaPbSource.getIdempotencyLevel)) else _root_.scala.None,
    uninterpretedOption = javaPbSource.getUninterpretedOptionList.asScala.iterator.map(com.google.protobuf.descriptor.UninterpretedOption.fromJavaProto).toSeq
  )
  def merge(`_message__`: com.google.protobuf.descriptor.MethodOptions, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodOptions = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MethodOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MethodOptions(
        deprecated = __fieldsMap.get(scalaDescriptor.findFieldByNumber(33).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        idempotencyLevel = __fieldsMap.get(scalaDescriptor.findFieldByNumber(34).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(__e.number)),
        uninterpretedOption = __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(17)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(17)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 34 => com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodOptions(
    deprecated = _root_.scala.None,
    idempotencyLevel = _root_.scala.None,
    uninterpretedOption = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __deprecated: _root_.scala.Option[_root_.scala.Boolean],
    private var __idempotencyLevel: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel],
    private var __uninterpretedOption: collection.mutable.Builder[com.google.protobuf.descriptor.UninterpretedOption, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.descriptor.MethodOptions] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 264 =>
            __deprecated = Option(_input__.readBool())
          case 272 =>
            __idempotencyLevel = Option(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(_input__.readEnum()))
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.descriptor.MethodOptions = {
      com.google.protobuf.descriptor.MethodOptions(
          deprecated = __deprecated,
          idempotencyLevel = __idempotencyLevel,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.descriptor.MethodOptions, com.google.protobuf.descriptor.MethodOptions.Builder] {
    def apply(): Builder = new Builder(
      __deprecated = _root_.scala.None,
      __idempotencyLevel = _root_.scala.None,
      __uninterpretedOption = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption],
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.descriptor.MethodOptions): Builder = new Builder(
      __deprecated = _message__.deprecated,
      __idempotencyLevel = _message__.idempotencyLevel,
      __uninterpretedOption = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= _message__.uninterpretedOption,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.descriptor.MethodOptions.Builder()
  def newBuilder(a: com.google.protobuf.descriptor.MethodOptions): Builder = com.google.protobuf.descriptor.MethodOptions.Builder(a)
  /** Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
    * or neither? HTTP based RPC implementation may choose GET verb for safe
    * methods, and PUT verb for idempotent methods instead of the default POST.
    */
  sealed abstract class IdempotencyLevel(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = IdempotencyLevel
    def isIdempotencyUnknown: _root_.scala.Boolean = false
    def isNoSideEffects: _root_.scala.Boolean = false
    def isIdempotent: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
    final def asRecognized: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.Recognized])
  }
  
  object IdempotencyLevel extends _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] {
    sealed trait Recognized extends IdempotencyLevel
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = this
    @SerialVersionUID(0L)
    case object IDEMPOTENCY_UNKNOWN extends IdempotencyLevel(0) with IdempotencyLevel.Recognized {
      val index = 0
      val name = "IDEMPOTENCY_UNKNOWN"
      override def isIdempotencyUnknown: _root_.scala.Boolean = true
    }
    
    /** implies idempotent
      */
    @SerialVersionUID(0L)
    case object NO_SIDE_EFFECTS extends IdempotencyLevel(1) with IdempotencyLevel.Recognized {
      val index = 1
      val name = "NO_SIDE_EFFECTS"
      override def isNoSideEffects: _root_.scala.Boolean = true
    }
    
    /** idempotent, but may have side effects
      */
    @SerialVersionUID(0L)
    case object IDEMPOTENT extends IdempotencyLevel(2) with IdempotencyLevel.Recognized {
      val index = 2
      val name = "IDEMPOTENT"
      override def isIdempotent: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends IdempotencyLevel(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT)
    def fromValue(__value: _root_.scala.Int): IdempotencyLevel = __value match {
      case 0 => IDEMPOTENCY_UNKNOWN
      case 1 => NO_SIDE_EFFECTS
      case 2 => IDEMPOTENT
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.MethodOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.MethodOptions.scalaDescriptor.enums(0)
    def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel): IdempotencyLevel = fromValue(pbJavaSource.getNumber)
    def toJavaValue(pbScalaSource: IdempotencyLevel): com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel = {
      _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
      com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(pbScalaSource.value)
    }
  }
  implicit class MethodOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodOptions](_l) {
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def idempotencyLevel: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = field(_.getIdempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = Option(f_)))
    def optionalIdempotencyLevel: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel]] = field(_.idempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val DEPRECATED_FIELD_NUMBER = 33
  final val IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    deprecated: _root_.scala.Option[_root_.scala.Boolean],
    idempotencyLevel: _root_.scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel],
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]
  ): _root_.com.google.protobuf.descriptor.MethodOptions = _root_.com.google.protobuf.descriptor.MethodOptions(
    deprecated,
    idempotencyLevel,
    uninterpretedOption
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.MethodOptions])
}
