// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api
import _root_.scalapb.internal.compat.JavaConverters._

/** Method represents a method of an API interface.
  *
  * @param name
  *   The simple name of this method.
  * @param requestTypeUrl
  *   A URL of the input message type.
  * @param requestStreaming
  *   If true, the request is streamed.
  * @param responseTypeUrl
  *   The URL of the output message type.
  * @param responseStreaming
  *   If true, the response is streamed.
  * @param options
  *   Any metadata attached to the method.
  * @param syntax
  *   The source syntax of this method.
  */
@SerialVersionUID(0L)
final case class Method(
    name: _root_.scala.Predef.String = "",
    requestTypeUrl: _root_.scala.Predef.String = "",
    requestStreaming: _root_.scala.Boolean = false,
    responseTypeUrl: _root_.scala.Predef.String = "",
    responseStreaming: _root_.scala.Boolean = false,
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.Seq.empty,
    syntax: com.google.protobuf.`type`.Syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Method] {
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
        val __value = requestTypeUrl
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = requestStreaming
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
        }
      };
      
      {
        val __value = responseTypeUrl
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = responseStreaming
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
        }
      };
      options.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = syntax.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(7, __value)
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
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = requestTypeUrl
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = requestStreaming
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
      {
        val __v = responseTypeUrl
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = responseStreaming
        if (__v != false) {
          _output__.writeBool(5, __v)
        }
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = syntax.value
        if (__v != 0) {
          _output__.writeEnum(7, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Method = copy(name = __v)
    def withRequestTypeUrl(__v: _root_.scala.Predef.String): Method = copy(requestTypeUrl = __v)
    def withRequestStreaming(__v: _root_.scala.Boolean): Method = copy(requestStreaming = __v)
    def withResponseTypeUrl(__v: _root_.scala.Predef.String): Method = copy(responseTypeUrl = __v)
    def withResponseStreaming(__v: _root_.scala.Boolean): Method = copy(responseStreaming = __v)
    def clearOptions = copy(options = _root_.scala.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Method = addAllOptions(__vs)
    def addAllOptions(__vs: Iterable[com.google.protobuf.`type`.OptionProto]): Method = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]): Method = copy(options = __v)
    def withSyntax(__v: com.google.protobuf.`type`.Syntax): Method = copy(syntax = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = requestTypeUrl
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = requestStreaming
          if (__t != false) __t else null
        }
        case 4 => {
          val __t = responseTypeUrl
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = responseStreaming
          if (__t != false) __t else null
        }
        case 6 => options
        case 7 => {
          val __t = syntax.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(requestTypeUrl)
        case 3 => _root_.scalapb.descriptors.PBoolean(requestStreaming)
        case 4 => _root_.scalapb.descriptors.PString(responseTypeUrl)
        case 5 => _root_.scalapb.descriptors.PBoolean(responseStreaming)
        case 6 => _root_.scalapb.descriptors.PRepeated(options.iterator.map(_.toPMessage).toVector)
        case 7 => _root_.scalapb.descriptors.PEnum(syntax.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.api.Method
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.Method])
}

object Method extends scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Method] with scalapb.JavaProtoSupport[com.google.protobuf.api.Method, com.google.protobuf.Method] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Method] with scalapb.JavaProtoSupport[com.google.protobuf.api.Method, com.google.protobuf.Method] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.api.Method = newBuilder.merge(input).result()
  def toJavaProto(scalaPbSource: com.google.protobuf.api.Method): com.google.protobuf.Method = {
    val javaPbOut = com.google.protobuf.Method.newBuilder
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.setRequestTypeUrl(scalaPbSource.requestTypeUrl)
    javaPbOut.setRequestStreaming(scalaPbSource.requestStreaming)
    javaPbOut.setResponseTypeUrl(scalaPbSource.responseTypeUrl)
    javaPbOut.setResponseStreaming(scalaPbSource.responseStreaming)
    javaPbOut.addAllOptions(_root_.scalapb.internal.compat.toIterable(scalaPbSource.options.iterator.map(com.google.protobuf.`type`.OptionProto.toJavaProto)).asJava)
    javaPbOut.setSyntaxValue(scalaPbSource.syntax.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Method): com.google.protobuf.api.Method = com.google.protobuf.api.Method(
    name = javaPbSource.getName,
    requestTypeUrl = javaPbSource.getRequestTypeUrl,
    requestStreaming = javaPbSource.getRequestStreaming.booleanValue,
    responseTypeUrl = javaPbSource.getResponseTypeUrl,
    responseStreaming = javaPbSource.getResponseStreaming.booleanValue,
    options = javaPbSource.getOptionsList.asScala.iterator.map(com.google.protobuf.`type`.OptionProto.fromJavaProto).toSeq,
    syntax = com.google.protobuf.`type`.Syntax.fromValue(javaPbSource.getSyntaxValue.intValue)
  )
  def merge(`_message__`: com.google.protobuf.api.Method, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.api.Method = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.api.Method] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.api.Method(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        requestTypeUrl = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        requestStreaming = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        responseTypeUrl = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        responseStreaming = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.Seq.empty),
        syntax = com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 6 => __out = com.google.protobuf.`type`.OptionProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 7 => com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = com.google.protobuf.api.Method(
    name = "",
    requestTypeUrl = "",
    requestStreaming = false,
    responseTypeUrl = "",
    responseStreaming = false,
    options = _root_.scala.Seq.empty,
    syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
  )
  final class Builder private (
    private var __name: _root_.scala.Predef.String,
    private var __requestTypeUrl: _root_.scala.Predef.String,
    private var __requestStreaming: _root_.scala.Boolean,
    private var __responseTypeUrl: _root_.scala.Predef.String,
    private var __responseStreaming: _root_.scala.Boolean,
    private var __options: collection.mutable.Builder[com.google.protobuf.`type`.OptionProto, _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]],
    private var __syntax: com.google.protobuf.`type`.Syntax,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.api.Method] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readStringRequireUtf8()
          case 18 =>
            __requestTypeUrl = _input__.readStringRequireUtf8()
          case 24 =>
            __requestStreaming = _input__.readBool()
          case 34 =>
            __responseTypeUrl = _input__.readStringRequireUtf8()
          case 40 =>
            __responseStreaming = _input__.readBool()
          case 50 =>
            __options += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.`type`.OptionProto](_input__)
          case 56 =>
            __syntax = com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.api.Method = {
      com.google.protobuf.api.Method(
        name = __name,
        requestTypeUrl = __requestTypeUrl,
        requestStreaming = __requestStreaming,
        responseTypeUrl = __responseTypeUrl,
        responseStreaming = __responseStreaming,
        options = __options.result(),
        syntax = __syntax,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.api.Method, com.google.protobuf.api.Method.Builder] {
    def apply(): Builder = new Builder(
      __name = "",
      __requestTypeUrl = "",
      __requestStreaming = false,
      __responseTypeUrl = "",
      __responseStreaming = false,
      __options = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto],
      __syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2,
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.api.Method): Builder = new Builder(
      __name = _message__.name,
      __requestTypeUrl = _message__.requestTypeUrl,
      __requestStreaming = _message__.requestStreaming,
      __responseTypeUrl = _message__.responseTypeUrl,
      __responseStreaming = _message__.responseStreaming,
      __options = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= _message__.options,
      __syntax = _message__.syntax,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.api.Method.Builder()
  def newBuilder(`_message__`: com.google.protobuf.api.Method): Builder = com.google.protobuf.api.Method.Builder(_message__)
  implicit class MethodLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.api.Method]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.api.Method](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def requestTypeUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.requestTypeUrl)((c_, f_) => c_.copy(requestTypeUrl = f_))
    def requestStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.requestStreaming)((c_, f_) => c_.copy(requestStreaming = f_))
    def responseTypeUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.responseTypeUrl)((c_, f_) => c_.copy(responseTypeUrl = f_))
    def responseStreaming: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.responseStreaming)((c_, f_) => c_.copy(responseStreaming = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def syntax: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val REQUEST_TYPE_URL_FIELD_NUMBER = 2
  final val REQUEST_STREAMING_FIELD_NUMBER = 3
  final val RESPONSE_TYPE_URL_FIELD_NUMBER = 4
  final val RESPONSE_STREAMING_FIELD_NUMBER = 5
  final val OPTIONS_FIELD_NUMBER = 6
  final val SYNTAX_FIELD_NUMBER = 7
  def of(
    name: _root_.scala.Predef.String,
    requestTypeUrl: _root_.scala.Predef.String,
    requestStreaming: _root_.scala.Boolean,
    responseTypeUrl: _root_.scala.Predef.String,
    responseStreaming: _root_.scala.Boolean,
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto],
    syntax: com.google.protobuf.`type`.Syntax
  ): _root_.com.google.protobuf.api.Method = _root_.com.google.protobuf.api.Method(
    name,
    requestTypeUrl,
    requestStreaming,
    responseTypeUrl,
    responseStreaming,
    options,
    syntax
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.Method])
}
