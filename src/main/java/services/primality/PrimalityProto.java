// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: isPrime.proto

package services.primality;

public final class PrimalityProto {
  private PrimalityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Primality_IsPrimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Primality_IsPrimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Primality_IsPrimeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Primality_IsPrimeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\risPrime.proto\022\tPrimality\" \n\016IsPrimeReq" +
      "uest\022\016\n\006number\030\001 \001(\005\"\"\n\017IsPrimeResponse\022" +
      "\017\n\007isPrime\030\001 \001(\0102\\\n\tPrimality\022O\n\024checkIf" +
      "NumberIsPrime\022\031.Primality.IsPrimeRequest" +
      "\032\032.Primality.IsPrimeResponse\"\000B&\n\022servic" +
      "es.primalityB\016PrimalityProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Primality_IsPrimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Primality_IsPrimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Primality_IsPrimeRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_Primality_IsPrimeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Primality_IsPrimeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Primality_IsPrimeResponse_descriptor,
        new java.lang.String[] { "IsPrime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
