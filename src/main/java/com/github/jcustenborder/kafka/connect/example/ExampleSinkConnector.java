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
import com.github.jcustenborder.kafka.connect.utils.config.Description;
import com.github.jcustenborder.kafka.connect.utils.config.TaskConfigs;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.sink.SinkConnector;

import java.util.List;
import java.util.Map;

@Description("This is the description of the connector.")
public class ExampleSinkConnector extends SinkConnector {
  Map<String, String> settings;

  @Override
  public void start(Map<String, String> settings) {
    ExampleSinkConnectorConfig config = new ExampleSinkConnectorConfig(settings);

    /**
     * Do whatever you need to do to setup your connector on a global scale. This is something that
     * will execute once per connector instance.
     */

    this.settings = settings;
  }

  @Override
  public Class<? extends Task> taskClass() {
    return ExampleSinkTask.class;
  }

  @Override
  public List<Map<String, String>> taskConfigs(int maxTasks) {
    return TaskConfigs.multiple(this.settings, maxTasks);
  }

  @Override
  public void stop() {

  }

  @Override
  public ConfigDef config() {
    return ExampleSinkConnectorConfig.config(ExampleSinkConnectorConfig.DEFAULT_CONFIG_OPTIONS);
  }

  @Override
  public String version() {
    return VersionUtil.version(this.getClass());
  }
}
