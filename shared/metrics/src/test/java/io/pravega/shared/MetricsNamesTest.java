/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.shared;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static io.pravega.shared.MetricsNames.joinWithDot;
import static org.junit.Assert.assertEquals;

@Slf4j
public class MetricsNamesTest {

    @Test
    public void testFailMetricName() {

        assertEquals(null, MetricsNames.failMetricName(null));
        assertEquals("", MetricsNames.failMetricName(""));
        assertEquals("tag_fail", MetricsNames.failMetricName("tag"));
        assertEquals("0_fail", MetricsNames.failMetricName("0"));
        assertEquals("tag1_fail", MetricsNames.failMetricName("tag1"));
        assertEquals("tag.tag_fail", MetricsNames.failMetricName("tag.tag"));
        assertEquals("tag_fail.1", MetricsNames.failMetricName("tag.1"));
        assertEquals("tag.tag1_fail", MetricsNames.failMetricName("tag.tag1"));
        assertEquals("tag1.tag2.tag3_fail", MetricsNames.failMetricName("tag1.tag2.tag3"));
        assertEquals("tag1.tag2_fail.3", MetricsNames.failMetricName("tag1.tag2.3"));
    }

    @Test
    public void testMetricKey() {
        MetricsNames.MetricKey keys = MetricsNames.metricKey("append_count.6", MetricsNames.COUNTER_SUFFIX);
        assertEquals("append_count.6.Counter", keys.getCacheKey());
        assertEquals("append_count.6.Counter", keys.getRegistryKey());

        keys = MetricsNames.metricKey("insert_latency", MetricsNames.TIMER_SUFFIX, "container", "7");
        assertEquals("insert_latency.7.Timer", keys.getCacheKey());
        assertEquals("insert_latency", keys.getRegistryKey());

        keys = MetricsNames.metricKey("queue_size", MetricsNames.GAUGE_SUFFIX, "container", "8", "hostname", "localhost");
        assertEquals("queue_size.8.localhost.Gauge", keys.getCacheKey());
        assertEquals("queue_size", keys.getRegistryKey());

        keys = MetricsNames.metricKey("create_segment_counter.9", MetricsNames.METER_SUFFIX);
        assertEquals("create_segment_counter.9.Meter", keys.getCacheKey());
        assertEquals("create_segment_counter.9.Meter", keys.getRegistryKey());

        keys = MetricsNames.metricKey("create_segment_counter", MetricsNames.METER_SUFFIX, "container", "9");
        assertEquals("create_segment_counter.9.Meter", keys.getCacheKey());
        assertEquals("create_segment_counter", keys.getRegistryKey());

        keys = MetricsNames.metricKey("write_latency", MetricsNames.NONE_SUFFIX, "container", "9");
        assertEquals("write_latency.9", keys.getCacheKey());
        assertEquals("write_latency", keys.getRegistryKey());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMetricKeyWithTagNameOnly() {
        MetricsNames.MetricKey keys = MetricsNames.metricKey("metric", MetricsNames.COUNTER_SUFFIX, "tagName");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMetricKeyWithOddNumberTags() {
        MetricsNames.MetricKey keys = MetricsNames.metricKey("metric", MetricsNames.COUNTER_SUFFIX, "tag1", "value1", "tag2");
    }

    @Test
    public void testMetricKeyWithSingleNull() {
        MetricsNames.MetricKey keys = MetricsNames.metricKey("metric", MetricsNames.COUNTER_SUFFIX, null);
        assertEquals("metric.Counter", keys.getCacheKey());
        assertEquals("metric.Counter", keys.getRegistryKey());
    }

    @Test  (expected = IllegalArgumentException.class)
    public void testMetricKeyWithDoubleNull() {
        MetricsNames.MetricKey keys = MetricsNames.metricKey("metric", MetricsNames.COUNTER_SUFFIX, null, null);
    }

    @Test
    public void testNameMethod() {
        assertEquals("A.B", joinWithDot("A", "B"));
    }
}
