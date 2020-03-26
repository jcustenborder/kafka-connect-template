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

import com.github.jcustenborder.kafka.connect.utils.config.ConfigKeyBuilder;
import org.apache.kafka.common.config.ConfigDef;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Generated("generate-config-classes")
public class ExampleSinkConnectorConfig
    extends BaseConnectorConfig {
  public static final ExampleSinkConnectorConfig.ConfigOptions DEFAULT_CONFIG_OPTIONS = new ExampleSinkConnectorConfig.ConfigOptionsImpl();
  public static final String GROUP_TARGET = "Target Configuration";
  public static final String TARGET_SERVERS_CONF = "myconn.target.servers";
  public static final Object TARGET_SERVERS_DEFAULT = Arrays.asList("http://localhost:8081");
  public static final String TARGET_SERVERS_DISPLAY_NAME = null;
  public static final String TARGET_SERVERS_DOC = "Server(s) to connect to.";
  private final List<String> targetServers;

  /**
   * Creates a new instance of the config.
   *
   * @param definition ConfigDef to initialize the AbstractConfig with.
   * @param originals  Original Configuration values as they were passed from the client.
   */
  public ExampleSinkConnectorConfig(ConfigDef definition, Map<?, ?> originals) {
    this(definition, originals, false);
  }

  /**
   * Creates a new instance of the config.
   *
   * @param originals Original Configuration values as they were passed from the client.
   */
  public ExampleSinkConnectorConfig(Map<?, ?> originals) {
    this(ExampleSinkConnectorConfig.config(DEFAULT_CONFIG_OPTIONS), originals, false);
  }

  /**
   * Creates a new instance of the config.
   *
   * @param definition ConfigDef to initialize the AbstractConfig with.
   * @param originals  Original Configuration values as they were passed from the client.
   * @param dolog      Flag to determine if the Configuration variables should be logged.
   */
  public ExampleSinkConnectorConfig(ConfigDef definition, Map<?, ?> originals, boolean dolog) {
    super(definition, originals, dolog);
    this.targetServers = getList(TARGET_SERVERS_CONF);
  }

  /**
   * Method is used to define a ConfigDef of this Configuration.
   *
   * @param options Options interface used to configure Recommenders and Validators for each of the configuration options.
   * @return Returns a ConfigDef for the current configuration
   */
  public static ConfigDef config(ExampleSinkConnectorConfig.ConfigOptions options) {
    ConfigDef config = BaseConnectorConfig.config(options);
    // Start Target Configuration
    config.define(ConfigKeyBuilder.of(TARGET_SERVERS_CONF, ConfigDef.Type.LIST).recommender(options.targetServersRecommender()).validator(options.targetServersValidator()).defaultValue(TARGET_SERVERS_DEFAULT).documentation(TARGET_SERVERS_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_TARGET).displayName(TARGET_SERVERS_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    // End Target Configuration
    return config;
  }

  /**
   * Server(s) to connect to.
   *
   * @return Server(s) to connect to.
   */
  public List<String> targetServers() {
    return this.targetServers;
  }


  /**
   * Interface is used to configure the Recommenders and Validators for this Configuration.
   */
  public interface ConfigOptions
      extends com.github.jcustenborder.kafka.connect.example.BaseConnectorConfig.ConfigOptions {

    /**
     * Method is used to define the Recommender that will be used for the 'myconn.target.servers' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender targetServersRecommender() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'myconn.target.servers' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator targetServersValidator() {
      return null;
    }
  }

  static class ConfigOptionsImpl
      implements ExampleSinkConnectorConfig.ConfigOptions {
  }
}
