import React from 'react';
import { requireNativeComponent, Platform, View } from 'react-native';

const RPBComponent = Platform.select({
  // sorry iOS :(
  ios: View,

  // name from overriden `getName` function
  android: requireNativeComponent('RoundedProgressBar')
});

export default class RoundedProgressBar extends React.Component {
  render() {
    const { size, percentage } = this.props;
    console.log(percentage)
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
