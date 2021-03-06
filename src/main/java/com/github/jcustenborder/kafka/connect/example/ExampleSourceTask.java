/**
 * Copyright © 2019 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.example;

import com.github.jcustenborder.kafka.connect.utils.VersionUtil;
import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;

import java.util.List;
import java.util.Map;

public class ExampleSourceTask extends SourceTask {
  @Override
  public String version() {
    return VersionUtil.version(this.getClass());
  }

  ExampleSourceConnectorConfig config;

  @Override
  public void start(Map<String, String> settings) {
    this.config = new ExampleSourceConnectorConfig(settings);
  }

  @Override
  public List<SourceRecord> poll() throws InterruptedException {

    return null;
  }

  @Override
  public void stop() {

  }
}
