import React, { createContext, useState, useContext } from 'react';
import PropTypes from 'prop-types';

export const TitleContext = createContext();

export default function PageProvider({ children }) {
  const [text01, setText01] = useState('');
  const [text02, setText02] = useState('');

  return (
    <TitleContext.Provider
      value={{
        text01,
        setText01,
        text02,
        setText02
      }}
    >
      {children}
    </TitleContext.Provider>
  );
}

export function useTitle() {
  const context = useContext(TitleContext);
  if (!context) throw new Error('usePage must be used whitin a PageProvider');
  const { text01, setText01, text02, setText02 } = context;
  return { text01, setText01, text02, setText02 };
}

PageProvider.propTypes = {
  children: PropTypes.element.isRequired,
};