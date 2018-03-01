package io.vertx.ext.web.handler.impl.logger;

import io.vertx.core.net.SocketAddress;
import io.vertx.ext.web.RoutingContext;

public class LocalIPParameter extends BaseParameter {

  public LocalIPParameter() {
    super(null);
  }

  @Override
  protected String getValue(RoutingContext context) {
    SocketAddress inetSocketAddress = context.request().localAddress();
    if (inetSocketAddress == null) {
      return null;
    }
    return inetSocketAddress.host();
  }
}