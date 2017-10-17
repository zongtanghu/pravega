/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.segmentstore.server.logs.operations;

import io.pravega.segmentstore.server.LogItem;

/**
 * Defines a Log Operation that marks a point in time.
 */
public interface TemporalOperation extends LogItem {
    /**
     * Gets a value indicating the timestamp (in milliseconds) of the operation.
     */
    long getTimestamp();

    /**
     * Sets a value indicating the timestamp (in milliseconds) of the operation.
     * @param timestamp the timestamp (in milliseconds)
     */
    void setTimestamp(long timestamp);
}