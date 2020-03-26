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
import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.types.Password;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Generated("generate-config-classes")
public class ExampleTransformationConfig
    extends AbstractConfig {
  public static final ExampleTransformationConfig.ConfigOptions DEFAULT_CONFIG_OPTIONS = new ExampleTransformationConfig.ConfigOptionsImpl();
  public static final String GROUP_SESSION = "Session Configuration";
  public static final String SESSION_SERVERS_CONF = "example.session.servers";
  public static final Object SESSION_SERVERS_DEFAULT = Arrays.asList("http://localhost:8081");
  public static final String SESSION_SERVERS_DISPLAY_NAME = null;
  public static final String SESSION_SERVERS_DOC = "Server(s) to connect to.";
  public static final String GROUP_SSL = "SSL Configuration";
  public static final String SSL_KEYSTORE_PATH_CONF = "example.ssl.keystore.path";
  public static final Object SSL_KEYSTORE_PATH_DEFAULT = "";
  public static final String SSL_KEYSTORE_PATH_DISPLAY_NAME = null;
  public static final String SSL_KEYSTORE_PATH_DOC = "Location of the Java keystore to use.";
  public static final String SSL_KEYSTORE_PASSWORD_CONF = "example.ssl.keystore.password";
  public static final Object SSL_KEYSTORE_PASSWORD_DEFAULT = ConfigDef.NO_DEFAULT_VALUE;
  public static final String SSL_KEYSTORE_PASSWORD_DISPLAY_NAME = null;
  public static final String SSL_KEYSTORE_PASSWORD_DOC = "Location of the Java keystore to use.";
  public static final String SSL_TRUSTSTORE_PATH_CONF = "example.ssl.truststore.path";
  public static final Object SSL_TRUSTSTORE_PATH_DEFAULT = "";
  public static final String SSL_TRUSTSTORE_PATH_DISPLAY_NAME = null;
  public static final String SSL_TRUSTSTORE_PATH_DOC = "Location of the Java truststore to use.";
  public static final String SSL_TRUSTSTORE_PASSWORD_CONF = "example.ssl.truststore.password";
  public static final Object SSL_TRUSTSTORE_PASSWORD_DEFAULT = new Password("changeit");
  public static final String SSL_TRUSTSTORE_PASSWORD_DISPLAY_NAME = null;
  public static final String SSL_TRUSTSTORE_PASSWORD_DOC = "Location of the Java truststore to use.";
  private final List<String> sessionServers;
  private final String sslKeystorePath;
  private final Password sslKeystorePassword;
  private final String sslTruststorePath;
  private final Password sslTruststorePassword;

  /**
   * Creates a new instance of the config.
   *
   * @param definition ConfigDef to initialize the AbstractConfig with.
   * @param originals  Original Configuration values as they were passed from the client.
   */
  public ExampleTransformationConfig(ConfigDef definition, Map<?, ?> originals) {
    this(definition, originals, false);
  }

  /**
   * Creates a new instance of the config.
   *
   * @param originals Original Configuration values as they were passed from the client.
   */
  public ExampleTransformationConfig(Map<?, ?> originals) {
    this(ExampleTransformationConfig.config(DEFAULT_CONFIG_OPTIONS), originals, false);
  }

  /**
   * Creates a new instance of the config.
   *
   * @param definition ConfigDef to initialize the AbstractConfig with.
   * @param originals  Original Configuration values as they were passed from the client.
   * @param dolog      Flag to determine if the Configuration variables should be logged.
   */
  public ExampleTransformationConfig(ConfigDef definition, Map<?, ?> originals, boolean dolog) {
    super(definition, originals, dolog);
    this.sessionServers = getList(SESSION_SERVERS_CONF);
    this.sslKeystorePath = getString(SSL_KEYSTORE_PATH_CONF);
    this.sslKeystorePassword = getPassword(SSL_KEYSTORE_PASSWORD_CONF);
    this.sslTruststorePath = getString(SSL_TRUSTSTORE_PATH_CONF);
    this.sslTruststorePassword = getPassword(SSL_TRUSTSTORE_PASSWORD_CONF);
  }

  /**
   * Method is used to define a ConfigDef of this Configuration.
   *
   * @param options Options interface used to configure Recommenders and Validators for each of the configuration options.
   * @return Returns a ConfigDef for the current configuration
   */
  public static ConfigDef config(ExampleTransformationConfig.ConfigOptions options) {
    ConfigDef config = new ConfigDef();
    // Start Session Configuration
    config.define(ConfigKeyBuilder.of(SESSION_SERVERS_CONF, ConfigDef.Type.LIST).recommender(options.sessionServersRecommender()).validator(options.sessionServersValidator()).defaultValue(SESSION_SERVERS_DEFAULT).documentation(SESSION_SERVERS_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_SESSION).displayName(SESSION_SERVERS_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    // End Session Configuration
    // Start SSL Configuration
    config.define(ConfigKeyBuilder.of(SSL_KEYSTORE_PATH_CONF, ConfigDef.Type.STRING).recommender(options.sslKeystorePathRecommender()).validator(options.sslKeystorePathValidator()).defaultValue(SSL_KEYSTORE_PATH_DEFAULT).documentation(SSL_KEYSTORE_PATH_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_SSL).displayName(SSL_KEYSTORE_PATH_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    config.define(ConfigKeyBuilder.of(SSL_KEYSTORE_PASSWORD_CONF, ConfigDef.Type.PASSWORD).recommender(options.sslKeystorePasswordRecommender()).validator(options.sslKeystorePasswordValidator()).defaultValue(SSL_KEYSTORE_PASSWORD_DEFAULT).documentation(SSL_KEYSTORE_PASSWORD_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_SSL).displayName(SSL_KEYSTORE_PASSWORD_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    config.define(ConfigKeyBuilder.of(SSL_TRUSTSTORE_PATH_CONF, ConfigDef.Type.STRING).recommender(options.sslTruststorePathRecommender()).validator(options.sslTruststorePathValidator()).defaultValue(SSL_TRUSTSTORE_PATH_DEFAULT).documentation(SSL_TRUSTSTORE_PATH_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_SSL).displayName(SSL_TRUSTSTORE_PATH_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    config.define(ConfigKeyBuilder.of(SSL_TRUSTSTORE_PASSWORD_CONF, ConfigDef.Type.PASSWORD).recommender(options.sslTruststorePasswordRecommender()).validator(options.sslTruststorePasswordValidator()).defaultValue(SSL_TRUSTSTORE_PASSWORD_DEFAULT).documentation(SSL_TRUSTSTORE_PASSWORD_DOC).importance(ConfigDef.Importance.HIGH).group(GROUP_SSL).displayName(SSL_TRUSTSTORE_PASSWORD_DISPLAY_NAME).width(ConfigDef.Width.MEDIUM).build());
    // End SSL Configuration
    return config;
  }

  /**
   * Server(s) to connect to.
   *
   * @return Server(s) to connect to.
   */
  public List<String> sessionServers() {
    return this.sessionServers;
  }

  /**
   * Location of the Java keystore to use.
   *
   * @return Location of the Java keystore to use.
   */
  public String sslKeystorePath() {
    return this.sslKeystorePath;
  }

  /**
   * Location of the Java keystore to use.
   *
   * @return Location of the Java keystore to use.
   */
  public Password sslKeystorePassword() {
    return this.sslKeystorePassword;
  }

  /**
   * Location of the Java truststore to use.
   *
   * @return Location of the Java truststore to use.
   */
  public String sslTruststorePath() {
    return this.sslTruststorePath;
  }

  /**
   * Location of the Java truststore to use.
   *
   * @return Location of the Java truststore to use.
   */
  public Password sslTruststorePassword() {
    return this.sslTruststorePassword;
  }


  /**
   * Interface is used to configure the Recommenders and Validators for this Configuration.
   */
  public interface ConfigOptions {

    /**
     * Method is used to define the Recommender that will be used for the 'example.session.servers' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender sessionServersRecommender() {
      return null;
    }

    /**
     * Method is used to define the Recommender that will be used for the 'example.ssl.keystore.path' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender sslKeystorePathRecommender() {
      return null;
    }

    /**
     * Method is used to define the Recommender that will be used for the 'example.ssl.keystore.password' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender sslKeystorePasswordRecommender() {
      return null;
    }

    /**
     * Method is used to define the Recommender that will be used for the 'example.ssl.truststore.path' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender sslTruststorePathRecommender() {
      return null;
    }

    /**
     * Method is used to define the Recommender that will be used for the 'example.ssl.truststore.password' parameter.
     *
     * @return Recommender for the Configuration item. null if no recommender is desired.
     */
    default ConfigDef.Recommender sslTruststorePasswordRecommender() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'example.session.servers' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator sessionServersValidator() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'example.ssl.keystore.path' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator sslKeystorePathValidator() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'example.ssl.keystore.password' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator sslKeystorePasswordValidator() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'example.ssl.truststore.path' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator sslTruststorePathValidator() {
      return null;
    }

    /**
     * Method is used to define the Validator that will be used for the 'example.ssl.truststore.password' parameter.
     *
     * @return Validator for the Configuration item. null if no validator is desired.
     */
    default ConfigDef.Validator sslTruststorePasswordValidator() {
      return null;
    }
  }

  static class ConfigOptionsImpl
      implements ExampleTransformationConfig.ConfigOptions {
  }
}
