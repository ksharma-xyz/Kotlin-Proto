// Code generated by Wire protocol buffer compiler, do not edit.
// Source: xyz.ksharma.transport.TransportService in xyz/ksharma/transport/transport_service.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.transport

import com.squareup.wire.GrpcCall
import com.squareup.wire.Service
import kotlin.Suppress

public interface TransportServiceClient : Service {
  public fun GetSchedule(): GrpcCall<Empty, FeedMessage>
}
