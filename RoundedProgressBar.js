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
          percent: props.percent / 100 || 0,
          borderWidth: props.borderWidth || 4,
          size: props.size / 2 || 20,
          color: props.color || "#c2c2c2",
          bgColor: props.bgColor || "#fff",
          backgroundWidth: props.backgroundWidth || 4,
          shadowColor: props.shadowColor || "#9e9e9e"
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

  const renderIOS = () => {
    const centered = props.size / 4;
    return (
      <View
        style={{
          width: props.size,
          height: props.size,
          justifyContent: "center",
          alignItems: "center"
        }}
      >
        <RNRoundedProgressBar
          props={formattedProps()}
          style={{
            position: "absolute",
            top: centered,
            left: centered
          }}
        />
        {props.children}
      </View>
    );
  };

  return isAndroid ? renderAndroid() : renderIOS();
};

export default RoundedProgressBar;
