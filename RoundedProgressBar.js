import React from "react";
import { View, requireNativeComponent, Platform } from "react-native";

const RNRoundedProgressBar = Platform.select({
  ios: requireNativeComponent("RoundedProgressBarIOS"),
  android: requireNativeComponent("RoundedProgressBar")
});

const isAndroid = Platform.OS === "android";

const RoundedProgressBar = props => {
  const formattedProps = () => {
    return isAndroid
      ? {
          ...props,
          percent: props.percent / 100,
          borderWidth: props.borderWidth + 3,
          backgroundWidth: props.backgroundWidth + 3,
          radius: null
        }
      : {
          percent: props.percent / 100 || 1,
          borderWidth: props.borderWidth || 4,
          size: props.size / 2 || 20,
          color: props.color || "#c2c2c2",
          bgColor: props.bgColor || "#fff"
        };
  };

  const renderAndroid = () => (
    <RNRoundedProgressBar
      {...formattedProps()}
      style={{
        width: props.size,
        height: props.size,
        display: "flex",
        justifyContent: "center",
        alignItems: "center"
      }}
    />
  );

  const renderIOS = () => (
    <View
      style={{
        width: 100,
        height: 100,
        justifyContent: "center",
        alignItems: "center"
      }}
    >
      <View
        style={{
          position: "absolute",
          top: 0,
          left: 0
        }}
      >
        <RNRoundedProgressBar props={formattedProps()} />
      </View>
      {props.children}
    </View>
  );

  return isAndroid ? renderAndroid() : renderIOS();
};

export default RoundedProgressBar;
