import React from 'react';
import { requireNativeComponent, Platform, View } from 'react-native';
import ProgressCircle from 'react-native-progress-circle';

const RPBComponent = Platform.select({
  // sorry iOS :(
  ios: ProgressCircle,

  // name from overriden `getName` function
  android: requireNativeComponent('RoundedProgressBar')
});

export default class RoundedProgressBar extends React.Component {
  render() {
    const { size } = this.props;
    return (
      <RPBComponent
        {...this.props}
        style={{
          width: size,
          height: size,
          display: "flex",
          justifyContent: 'center',
          alignItems: 'center' 
        }}
      />
    );
  }
}
