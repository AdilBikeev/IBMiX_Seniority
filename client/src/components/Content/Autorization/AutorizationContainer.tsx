import React from 'react'
import { Autorization, MapStateToProps } from './Autorization';
import { AppStateType } from '../../../redux/redux-store';
import { connect } from 'react-redux';
import { MapDispatchToProps } from './Autorization';
import { logOut, setUser } from './../../../redux/Profile/profile-actions'

const mapStateToProps = (state: AppStateType) => {
    return {

    }
};

type Props = ReturnType<typeof mapStateToProps>;

class AutorizationClassComponent extends React.Component<MapStateToProps & MapDispatchToProps> {
    render() {
        return <Autorization {...this.props}/>
    }
};

export const AutorizationContainter = connect<MapStateToProps, MapDispatchToProps, {}, AppStateType>(
    mapStateToProps,
    {logOut, setUser}
)(AutorizationClassComponent)